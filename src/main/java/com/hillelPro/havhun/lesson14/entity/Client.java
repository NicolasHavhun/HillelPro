package com.hillelPro.havhun.lesson14.entity;

public class Client {
    private String name;
    public void say(){
        System.out.println("CLIENT SAY SOMETHING...");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                '}';
    }
}
