package com.hillelPro.havhun.homework13.interfaces;

public interface Flyable {
    public default String move(String stringForPrint) {
        final String result = "Flyable animal move: ".concat(stringForPrint);
        System.out.println(result);
        return result;
    }

    public static void fly() {
        System.out.println("FLY!!!");
    }

    public void fallFlyable();

    public void takeOffFlyable();

}
