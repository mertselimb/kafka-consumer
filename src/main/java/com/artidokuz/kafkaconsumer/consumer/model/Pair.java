package com.artidokuz.kafkaconsumer.consumer.model;

public class Pair {
    private String str0;
    private String str1;

    public Pair(String str0, String str1) {
        this.str0 = str0;
        this.str1 = str1;
    }

    public void setStr0(String str0) {
        this.str0 = str0;
    }

    public void setStr1(String str1) {
        this.str1 = str1;
    }

    public String getStr0() {
        return str0;
    }

    public String getStr1() {
        return str1;
    }

    @Override
    public String toString() {
        return "[\"" + this.str0 + "\",\"" + this.str1 + "\"]" ;
    }
}
