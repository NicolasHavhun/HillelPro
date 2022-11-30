package com.hillelPro.havhun.lesson23.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockExample {
    Lock lock = new ReentrantLock();
    public  void print(){
        lock.lock();
        for (int i = 0; i < 100; i++) {
            System.out.println("printprint");

        }
    }
    public void write(){
        for (int i = 0; i < 100; i++) {
            System.out.println("write");
        }
        lock.unlock();
    }
}
