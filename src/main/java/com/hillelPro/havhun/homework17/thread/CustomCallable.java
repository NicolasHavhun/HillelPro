package com.hillelPro.havhun.homework17.thread;

import java.util.concurrent.Callable;

public class CustomCallable implements Callable<String> {

    @Override
    public String call() throws Exception {
        Thread.currentThread().setName("CustomCallable");
        for (int i = 0; i < 1000; i++) {

            System.out.println(AdditionalThread.threadExample());
        }
        return "DEFAULT STRING OF CUSTOM CALLABLE";
    }
}
