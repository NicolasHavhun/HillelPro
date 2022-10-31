package com.hillelPro.havhun.homework13.interfaces;

public interface Bounceable {
    public default String move(String stringForPrint) {
        final String result = "Bounceable animal move: ".concat(stringForPrint);
        System.out.println(result);
        return result;
    }

    public static void bounce() {
        System.out.println("JUMP!!!");
    }

    public void jumpOverObstacles();

    public void jumpUnderground();


}
