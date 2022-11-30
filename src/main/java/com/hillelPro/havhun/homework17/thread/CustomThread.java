package com.hillelPro.havhun.homework17.thread;

public class CustomThread extends Thread {
    @Override
    public void run() {
        Thread.currentThread().setName("CustomThread");
        for (int i = 0; i < 1000; i++) {

            System.out.println(AdditionalThread.threadExample());
        }
    }

}
