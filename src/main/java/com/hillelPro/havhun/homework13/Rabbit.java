package com.hillelPro.havhun.homework13;

import com.hillelPro.havhun.homework13.interfaces.Bounceable;
import com.hillelPro.havhun.homework13.interfaces.Runnable;

public class Rabbit implements Runnable, Bounceable {


    @Override
    public void jumpOverObstacles() {
        System.out.println("Rabbit can jump over obstacles");
    }

    @Override
    public void jumpUnderground() {
        System.out.println("Rabbit can jump underground");

    }

    @Override
    public void accelerateRun() {
        System.out.println("Rabbit accelerate");

    }

    @Override
    public void brakeRun() {
        System.out.println("Rabbit slows down");

    }
}
