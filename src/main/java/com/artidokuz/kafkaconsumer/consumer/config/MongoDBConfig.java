package com.artidokuz.kafkaconsumer.consumer.config;

import com.artidokuz.kafkaconsumer.consumer.repository.DataRepository;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableMongoRepositories(basePackageClasses = DataRepository.class)
@Configuration
public class MongoDBConfig {
}
