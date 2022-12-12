package com.hillelPro.havhun.homework19;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    private static final AtomicInteger atomicCounter = new AtomicInteger(20000);

    public static void main(String[] args) {
        final ExecutorService executorService = Executors.newFixedThreadPool(2);

        for (int i = 0; i < 2; i++) {
            int numberThread = i;
            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    atomicTread(numberThread);
                }
            });
        }
        executorService.shutdownNow();

//        2.
//        lockExample();
//        3.
        DeadLockOne deadLockOne = new DeadLockOne();
        DeadLockTwo deadLockTwo = new DeadLockTwo();
        deadLockOne.setDeadLockTwo(deadLockTwo);
        deadLockTwo.setDeadLockOne(deadLockOne);

        Thread thread1 = new Thread(() ->
                System.out.println(deadLockOne.getStringFromSecondClass()));
        Thread thread2 = new Thread(() ->
                System.out.println(deadLockTwo.getStringFromFirstClass()));

        thread1.start();
        thread2.start();

    }

    private static void atomicTread(int numberThread) {

        for (int i = 0; i < 10000; i++) {
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    Object object = new Object();
                    synchronized (object) {
                        atomicCounter.decrementAndGet();

                        System.out.println("Thread pool: " + numberThread + " " + Thread.currentThread().getName());
                        System.out.println("Atomic Counter: " + atomicCounter);
                    }
                }
            });
            thread.start();
        }
    }

    private static void lockExample() {

        final LockExample lockExample = new LockExample();
        for (int i = 0; i < 3; i++) {
            Thread thread = new Thread(new Runnable() {

                @Override
                public void run() {
                    lockExample.print();
                    lockExample.increment(0);
                    lockExample.write();
                }
            });
            thread.start();
        }
    }
}
