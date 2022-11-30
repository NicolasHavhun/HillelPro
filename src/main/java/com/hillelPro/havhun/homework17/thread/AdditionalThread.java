package com.hillelPro.havhun.homework17.thread;

public class AdditionalThread {
    private static int numExample = 0;
    public static int threadExample() {
        System.out.println(Thread.currentThread().getName()+" + num example: "+numExample);

        return ++numExample;
    }
}
