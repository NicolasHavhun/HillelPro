package com.hillelPro.havhun.lesson21.thread;

public class CustomRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println("CustomRunnable "+Thread.currentThread().getName());
        System.out.println("Thead is aliva: "+ Thread.currentThread().isAlive());
    }
}
