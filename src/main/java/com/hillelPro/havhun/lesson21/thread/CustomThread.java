package com.hillelPro.havhun.lesson21.thread;

public class CustomThread extends Thread{
    @Override
    public void run(){
        System.out.println("CUSTOMTHREAD IS RUNNING");
        System.out.println(Thread.currentThread().getName());
    }

}
