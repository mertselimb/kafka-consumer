package com.artidokuz.kafkaconsumer.consumer.resource;

import com.artidokuz.kafkaconsumer.consumer.model.Data;
import com.artidokuz.kafkaconsumer.consumer.repository.DataRepository;
import com.artidokuz.kafkaconsumer.consumer.repository.RuntimeList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DataResource {

    @Autowired
    public RuntimeList runtimeList;

    @Autowired
    private DataRepository dataRepository;

    @GetMapping("/all")
    public List<Data> getAll() {
        System.out.println(runtimeList.getMap().toString());
        return dataRepository.findAll();
    }

    @GetMapping("/list")
    public String getList() {
        return runtimeList.toString();
    }

}

