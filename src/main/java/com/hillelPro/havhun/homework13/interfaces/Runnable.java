package com.hillelPro.havhun.homework13.interfaces;

import com.hillelPro.havhun.homework13.interfaces.Bounceable;

public interface Runnable extends Bounceable {
    public default String move(String stringForPrint) {
        final String result = "Runnable animal move: ".concat(stringForPrint);
        System.out.println(result);
        return result;
    }

    public static void run() {
        System.out.println("RUN!!!");
    }

    public void accelerateRun();

    public void brakeRun();

}
