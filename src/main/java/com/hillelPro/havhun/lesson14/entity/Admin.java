package com.hillelPro.havhun.lesson14.entity;

public class Admin extends User{

    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void say() {
        System.out.println("ADMIN SAY SOMETHING....");
    }
}
