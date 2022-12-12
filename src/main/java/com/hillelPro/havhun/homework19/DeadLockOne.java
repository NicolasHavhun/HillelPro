package com.hillelPro.havhun.homework19;

public class DeadLockOne {
    private DeadLockTwo deadLockTwo;

    public DeadLockTwo getDeadLockTwo() {
        return deadLockTwo;
    }

    public void setDeadLockTwo(DeadLockTwo deadLockTwo) {
        this.deadLockTwo = deadLockTwo;
    }

    public synchronized String getString() {
        return "Hello from DeadLockOne Class";
    }

    public synchronized String getStringFromSecondClass() {
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return deadLockTwo.getString();
    }

}
