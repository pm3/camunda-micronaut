package com.aston.camunda;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.clients.producer.RecordMetadata;
import org.apache.kafka.common.header.Headers;
import org.apache.kafka.common.header.internals.RecordHeaders;

import java.nio.charset.StandardCharsets;
import java.util.function.Function;

public class KafkaJsonMessageBuilder {

    KafkaProducer<String, String> kafkaProducer;
    Function<Object, String> jsonCreator;

    String topic;
    Integer partition;
    String key;
    String value;
    Headers headers = null;

    public KafkaJsonMessageBuilder(KafkaProducer<String, String> kafkaProducer, Function<Object, String> jsonCreator, String topic) {
        this.kafkaProducer = kafkaProducer;
        this.jsonCreator = jsonCreator;
        this.topic = topic;
    }

    public KafkaJsonMessageBuilder partition(Integer partition) {
        this.partition = partition;
        return this;
    }

    public KafkaJsonMessageBuilder key(String key) {
        this.key = key;
        return this;
    }

    public KafkaJsonMessageBuilder data(String value) {
        this.value = value;
        return this;
    }

    public KafkaJsonMessageBuilder dataJson(Object value) {
        this.value = jsonCreator.apply(value);
        return this;
    }

    public KafkaJsonMessageBuilder header(String key, String value) {
        if (headers == null) headers = new RecordHeaders();
        headers.add(key, value.getBytes(StandardCharsets.UTF_8));
        return this;
    }

    public RecordMetadata send() throws Exception {
        ProducerRecord<String, String> record = new ProducerRecord<String, String>(topic, partition, key, value, headers);
        return kafkaProducer.send(record).get();
    }
}
