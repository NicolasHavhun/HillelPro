package com.hillelPro.havhun.lesson21;

import com.hillelPro.havhun.lesson21.thread.CustomThread;

import java.util.concurrent.ExecutionException;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
//        CustomThread customThread = new CustomThread();
//        customThread.run();
//        customThread.start();


        CustomThread customThread1 = new CustomThread();
        Thread runnableThread = new Thread(customThread1);
        System.out.println("CustomRunnable "+Thread.currentThread().isAlive());
        Thread.sleep(3000);
        runnableThread.start();

//        CustomCallable customCallable = new CustomCallable();
//        FutureTask<String> featureTask = new FutureTask<>(customCallable);
//        Thread thread = new Thread(featureTask);
//        thread.start();
//        final  String result = featureTask.get();
//        System.out.println("CustomCallable: "+result);
//        runFewThreads();
    }

    private static void runFewThreads(){
        for (int i = 0; i < 10; i++) {
            new Thread(() ->
                System.out.println("run few Elements: "+Thread.currentThread().getName())).start();


        }
    }
}
