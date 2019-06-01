package com.artidokuz.kafkaconsumer.consumer.repository;

import com.artidokuz.kafkaconsumer.consumer.model.Data;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DataRepository extends MongoRepository<Data, Integer> {
}