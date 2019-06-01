package com.artidokuz.kafkaconsumer.consumer.model;

import org.json.*;

public class Data {
        public String timeStamp;
        public String logLevel;
        public String cityName;
        public String logDetail;


    public String getJson() {

        try {
            return new JSONObject()
                    .put("timeStamp", this.timeStamp)
                    .put("logLevel", this.logLevel)
                    .put("cityName", this.cityName)
                    .put("logDetail", this.logDetail)
                    .toString();
        } catch (Exception exc) {
            // TODO: handle exception
        }
        return "False";
    }

    public String toString(){
        return this.timeStamp + " : " + this.logLevel + " : " + this.cityName + " : " + this.logDetail;
    }
}

