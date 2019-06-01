package com.artidokuz.kafkaconsumer.consumer.repository;
import com.artidokuz.kafkaconsumer.consumer.model.Pair;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Scope(value = "singleton")
@Component
public class RuntimeList {
    private List<Pair> list = new ArrayList<>();

    public List<Pair> getMap() {
        return list;
    }

    public void putInto(String str , String time) {
        list.add(new Pair(str, time));
    }

    @Override
    public String toString(){
        String str = "";

        for(Pair pair : list){
            if(str.equals("")){
                str = str + pair.toString();
            }else{
                str = str + "," + pair.toString();
            }
        }
        return "{" + str + "}" ;
    }
}

