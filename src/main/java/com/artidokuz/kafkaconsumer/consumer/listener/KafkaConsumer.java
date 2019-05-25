package com.artidokuz.kafkaconsumer.consumer.listener;

import com.artidokuz.kafkaconsumer.consumer.model.Data;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    @KafkaListener(topics = "deneme", group = "group_id")
    public void consume(String message) {
        System.out.println("Consumed message: " + message);
    }

    @KafkaListener(topics = "teb0", group = "group_json",
            containerFactory = "userKafkaListenerFactory")
    public void consumeJson(Data data) {
        System.out.println("Consumed JSON Message: " + data);
        System.out.println(data.cityName);
    }
}