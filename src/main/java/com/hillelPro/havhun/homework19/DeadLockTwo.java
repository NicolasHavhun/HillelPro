package com.hillelPro.havhun.homework19;

public class DeadLockTwo {
    private DeadLockOne deadLockOne;

    public DeadLockOne getDeadLockOne() {
        return deadLockOne;
    }

    public void setDeadLockOne(DeadLockOne deadLockOne) {
        this.deadLockOne = deadLockOne;
    }

    public synchronized String getString() {
        return "Hello from DeadLockTwo class";
    }

    public synchronized String getStringFromFirstClass() {
        return deadLockOne.getString();
    }

}
