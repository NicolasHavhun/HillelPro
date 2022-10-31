package com.hillelPro.havhun.homework13.interfaces;

public interface Swimmable {
    public default String move(String stringForPrint) {
        final String result = "Swimmable animal move: ".concat(stringForPrint);
        System.out.println(result);
        return result;
    }

    public static void swim() {
        System.out.println("SWIM!!!");
    }

    public void diveSwim();

    public void floatSwim();

}

