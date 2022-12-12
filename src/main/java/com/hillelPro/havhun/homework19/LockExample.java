package com.hillelPro.havhun.homework19;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockExample {
    Lock lock = new ReentrantLock();

    public void print() {
        lock.lock();
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " I'm printing the first method ");
        }
    }

    public void increment(int counter) {

        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " " + counter++);
        }
    }

    public void write() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " I'm writing the third method");
        }
        lock.unlock();
    }

}
