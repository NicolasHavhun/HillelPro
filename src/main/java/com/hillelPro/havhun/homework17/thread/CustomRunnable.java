package com.hillelPro.havhun.homework17.thread;

public class CustomRunnable implements Runnable {

    @Override
    public void run() {
        Thread.currentThread().setName("Custom Runnable Thread");
        for (int i = 0; i < 1000; i++) {

            System.out.println(AdditionalThread.threadExample());
        }
    }
}
