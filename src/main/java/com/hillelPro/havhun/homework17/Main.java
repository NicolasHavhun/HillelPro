package com.hillelPro.havhun.homework17;

import com.hillelPro.havhun.homework17.thread.CustomCallable;
import com.hillelPro.havhun.homework17.thread.CustomRunnable;
import com.hillelPro.havhun.homework17.thread.CustomThread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CustomThread customThread = new CustomThread();
        customThread.start();

        CustomRunnable customRunnable = new CustomRunnable();
        Thread runnableThread = new Thread(customRunnable);
        runnableThread.start();

        CustomCallable customCallable = new CustomCallable();
        FutureTask<String> customCallableFutureTask = new FutureTask<>(customCallable);
        Thread callableThread = new Thread(customCallableFutureTask);
        callableThread.start();
        String resultString = customCallableFutureTask.get();
        System.out.println("Custom Callable result: " + resultString);


    }
}
