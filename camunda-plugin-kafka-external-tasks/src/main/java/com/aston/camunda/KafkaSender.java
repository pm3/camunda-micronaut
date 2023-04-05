package com.aston.camunda;

import camundajar.impl.com.google.gson.Gson;
import camundajar.impl.com.google.gson.GsonBuilder;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.serialization.StringSerializer;

import java.net.InetAddress;
import java.util.Properties;

public class KafkaSender {

    KafkaProducer<String, String> kafkaProducer;
    Gson gson;

    public KafkaSender(String bootstrapAddress) throws Exception {
        Properties config = new Properties();
        config.put("client.id", InetAddress.getLocalHost().getHostName());
        config.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapAddress);
        config.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
        config.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
        this.kafkaProducer = new KafkaProducer<>(config);
        this.gson = new GsonBuilder().setDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS").create();
    }

    public KafkaJsonMessageBuilder builder(String topic) {
        return new KafkaJsonMessageBuilder(kafkaProducer, gson::toJson, topic);
    }

    public String toJson(Object src) {
        return gson.toJson(src);
    }
}
