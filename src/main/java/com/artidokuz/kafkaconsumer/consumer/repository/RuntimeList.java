package com.artidokuz.kafkaconsumer.consumer.repository;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import java.util.HashMap;

@Scope(value = "singleton")
@Component
public class RuntimeList {
    private HashMap<String,String> list = new HashMap<>();

    public HashMap<String,String> getList() {
        return list;
    }

    public void putInto(String str , String time) {
        list.put(str , time);
    }
}