package com.aston.camunda;

import org.camunda.bpm.engine.impl.cfg.AbstractProcessEnginePlugin;
import org.camunda.bpm.engine.impl.cfg.ProcessEngineConfigurationImpl;
import org.camunda.bpm.engine.impl.history.event.HistoricExternalTaskLogEntity;
import org.camunda.bpm.engine.impl.history.event.HistoryEvent;
import org.camunda.bpm.engine.impl.history.handler.HistoryEventHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class KafkaEventPlugin extends AbstractProcessEnginePlugin {

    private KafkaSender kafkaSender = null;

    private String bootstrapAddress = "kafka:9092";
    private String externalTaskTopic = "camunda-external-tasks";

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
        }

        processEngineConfiguration.getCustomHistoryEventHandlers().add(new HistoryEventHandler() {
            @Override
            public void handleEvent(HistoryEvent historyEvent) {
                if (historyEvent instanceof HistoricExternalTaskLogEntity) {
                    HistoricExternalTaskLogEntity externalTaskEvent = (HistoricExternalTaskLogEntity) historyEvent;
                    if (externalTaskEvent.isCreationLog()) {
                        sendExternalTask(externalTaskEvent);
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

    public void sendExternalTask(HistoricExternalTaskLogEntity entity) {
        Map<String, Object> data = new HashMap<>();
        data.put("externalTaskId", entity.getExternalTaskId());
        data.put("executionId", entity.getExecutionId());
        data.put("topicName", entity.getTopicName());
        data.put("priority", entity.getPriority());
        data.put("processInstanceId", entity.getProcessInstanceId());
        data.put("processDefinitionKey", entity.getProcessDefinitionKey());
        data.put("activityId", entity.getActivityId());
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS");
        data.put("created", sdf.format(entity.getTimestamp()));
        try {
            LOGGER.info("send external task {} {}", entity.getExternalTaskId(), entity.getTopicName());
            kafkaSender.builder(externalTaskTopic)
                    .dataJson(data)
                    .header("camunda-topic", entity.getTopicName())
                    .header("camunda-process", entity.getProcessDefinitionKey())
                    .send();
        } catch (Exception e) {
            LOGGER.error("send external task to kafka error {} {}", entity.getExternalTaskId(), e.getMessage());
        }
    }
}
