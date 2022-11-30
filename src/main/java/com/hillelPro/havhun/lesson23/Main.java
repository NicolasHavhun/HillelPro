package com.hillelPro.havhun.lesson23;

import com.hillelPro.havhun.lesson23.lock.LockExample;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {
        private static  volatile int counter = 0;
        private static  volatile AtomicInteger atomic =  new AtomicInteger(1);
//        private static

    public static void main(String[] args) {
//        Thread thread = new Thread(new Runnable() {
//            @Override
//            public void run() {
//
//            }
//        });
        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(() -> {
                for (int i1 = 0; i1 < 100; i1++) {
                    atomic.incrementAndGet();
//                    counter++;
                }
            });
            thread.start();

            }
        System.out.println("result: "+atomic);

//        AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(10);
//        atomicIntegerArray.
//        volatileExample();
        AtomicInteger atomicInteger = new AtomicInteger(0);
        atomicInteger.incrementAndGet();
        atomicInteger.incrementAndGet();
        atomicInteger.incrementAndGet();
        System.out.println("incrementAndGet(): "+atomicInteger.get());
//        List<String> synchronizedList = Collections.synchronizedList(new ArrayList<>());
//        Set<Object> objects = Collections.synchronizedSet();
        ConcurrentHashMap<String, String> ConcurrentHashMap = new ConcurrentHashMap<>();

    }
        private static void volatileExample(){
            Thread thread1 = new Thread(() -> {
                while (counter < 10) {
                    System.out.println("Thread one: " + ++counter);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            });
            thread1.start();

            Thread thread2 = new Thread(() -> {
                int cacheCounter = counter;
                while (counter < 10) {
                    if (cacheCounter != counter) {
                        System.out.println("Thread two: " + counter);
                        cacheCounter = counter;
                    }
                }
            });
            thread2.start();
            lockExample();

        }
        private static  void lockExample(){
            new Thread(new Runnable() {
                private LockExample lockExample = new  LockExample();
                @Override
                public void run() {
                    lockExample.print();
                    lockExample.write();

                }
            });

        }
    }


