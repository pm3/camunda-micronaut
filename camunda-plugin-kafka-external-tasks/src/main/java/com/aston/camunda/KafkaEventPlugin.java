package com.aston.camunda;

import org.camunda.bpm.engine.ExternalTaskService;
import org.camunda.bpm.engine.externaltask.ExternalTask;
import org.camunda.bpm.engine.externaltask.ExternalTaskQuery;
import org.camunda.bpm.engine.impl.cfg.AbstractProcessEnginePlugin;
import org.camunda.bpm.engine.impl.cfg.ProcessEngineConfigurationImpl;
import org.camunda.bpm.engine.impl.history.event.HistoricExternalTaskLogEntity;
import org.camunda.bpm.engine.impl.history.event.HistoryEvent;
import org.camunda.bpm.engine.impl.history.event.UserOperationLogEntryEventEntity;
import org.camunda.bpm.engine.impl.history.handler.HistoryEventHandler;
import org.camunda.bpm.engine.impl.persistence.entity.ExternalTaskEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class KafkaEventPlugin extends AbstractProcessEnginePlugin {

    private KafkaSender kafkaSender = null;

    private String bootstrapAddress = "kafka:9092";
    private String externalTaskTopic = "camunda-external-tasks";

    private final Timer timer = new Timer("kafka-plugin-timer");
    private final Executor executor = Executors.newSingleThreadExecutor();

    private ExternalTaskService externalTaskService;

    public String getBootstrapAddress() {
        return bootstrapAddress;
    }

    public void setBootstrapAddress(String bootstrapAddress) {
        this.bootstrapAddress = bootstrapAddress;
    }

    public String getExternalTaskTopic() {
        return externalTaskTopic;
    }

    public void setExternalTaskTopic(String externalTaskTopic) {
        this.externalTaskTopic = externalTaskTopic;
    }

    private final static Logger LOGGER = LoggerFactory.getLogger(KafkaEventPlugin.class);

    @Override
    public void preInit(ProcessEngineConfigurationImpl processEngineConfiguration) {
        if (kafkaSender == null) {
            try {
                kafkaSender = new KafkaSender(bootstrapAddress);
            } catch (Exception e) {
                throw new RuntimeException("error create kafka " + e.getMessage(), e);
            }
            this.externalTaskService = processEngineConfiguration.getExternalTaskService();
            timer.schedule(new TimerTask() {
                @Override
                public void run() {
                    loadLockExpired();
                }
            }, 30_000, 30_000);
        }
        processEngineConfiguration.getCustomHistoryEventHandlers().add(new HistoryEventHandler() {
            @Override
            public void handleEvent(HistoryEvent historyEvent) {
                System.out.println(LocalDateTime.now().format(DateTimeFormatter.ISO_DATE_TIME) + " " + historyEvent.getClass().getName() + " " + kafkaSender.toJson(historyEvent));
                if (historyEvent instanceof HistoricExternalTaskLogEntity) {
                    HistoricExternalTaskLogEntity externalTaskEvent = (HistoricExternalTaskLogEntity) historyEvent;
                    if (externalTaskEvent.isCreationLog()) {
                        ExternalTaskEntity externalTask = new ExternalTaskEntity();
                        externalTask.setId(externalTaskEvent.getExternalTaskId());
                        externalTask.setExecutionId(externalTaskEvent.getExecutionId());
                        externalTask.setTopicName(externalTaskEvent.getTopicName());
                        externalTask.setPriority(externalTaskEvent.getPriority());
                        externalTask.setProcessInstanceId(externalTaskEvent.getProcessInstanceId());
                        externalTask.setProcessDefinitionKey(externalTaskEvent.getProcessDefinitionKey());
                        externalTask.setActivityId(externalTaskEvent.getActivityId());
                        externalTask.setRetries(0);
                        executor.execute(() -> sendExternalTask(externalTask));
                    }
                }
                if (historyEvent instanceof UserOperationLogEntryEventEntity) {
                    UserOperationLogEntryEventEntity userOperationEvent = (UserOperationLogEntryEventEntity) historyEvent;
                    if ("SetExternalTaskRetries".equals(userOperationEvent.getOperationType())) {
                        executor.execute(() -> loadLockExpired());
                    }
                }
            }

            @Override
            public void handleEvents(List<HistoryEvent> list) {
                for (HistoryEvent e : list) {
                    handleEvent(e);
                }
            }
        });
    }

    private List<String> lastIds = new ArrayList<>();

    public void loadLockExpired() {
        List<String> nowLastIds = new ArrayList<>();
        ExternalTaskQuery q = externalTaskService.createExternalTaskQuery();
        q.notLocked();
        q.withRetriesLeft();
        q.lockExpirationBefore(new Date());
        List<ExternalTask> l = q.list();
        for (ExternalTask task : l) {
            nowLastIds.add(task.getId());
            if (!this.lastIds.contains(task.getId())) {
                sendExternalTask(task);
            }
        }
        this.lastIds = nowLastIds;
    }

    public void sendExternalTask(ExternalTask task) {
        Map<String, Object> data = new HashMap<>();
        data.put("externalTaskId", task.getId());
        data.put("executionId", task.getExecutionId());
        data.put("topicName", task.getTopicName());
        data.put("priority", task.getPriority());
        data.put("processInstanceId", task.getProcessInstanceId());
        data.put("processDefinitionKey", task.getProcessDefinitionKey());
        data.put("activityId", task.getActivityId());
        data.put("retries", task.getRetries());
        try {
            LOGGER.info("send external task {} {}", task.getId(), task.getTopicName());
            kafkaSender.builder(externalTaskTopic)
                    .dataJson(data)
                    .header("camunda-topic", task.getTopicName())
                    .header("camunda-process", task.getProcessDefinitionKey())
                    .send();
        } catch (Exception e) {
            LOGGER.error("send external task to kafka error {} {}", task.getId(), e.getMessage());
        }
    }
}
