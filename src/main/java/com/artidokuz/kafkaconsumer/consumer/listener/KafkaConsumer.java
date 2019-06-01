package com.artidokuz.kafkaconsumer.consumer.listener;

import com.artidokuz.kafkaconsumer.consumer.model.Data;
import com.artidokuz.kafkaconsumer.consumer.repository.DataRepository;
import com.artidokuz.kafkaconsumer.consumer.repository.RuntimeList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;


@EnableMongoRepositories(basePackageClasses = DataRepository.class)

@Service
public class KafkaConsumer {

    @Autowired
    public static final String TOPIC = "teb";

    @Autowired
    public RuntimeList runtimeList;

    @Autowired
    private DataRepository dataRepository;

    @KafkaListener(topics = TOPIC, group = "group_json",
            containerFactory = "userKafkaListenerFactory")
    public void consumeJson(Data data) {
        runtimeList.putInto(data.cityName, data.timeStamp);
        dataRepository.save(data);
        System.out.println("Consumed JSON Message: " + data);
    }


}