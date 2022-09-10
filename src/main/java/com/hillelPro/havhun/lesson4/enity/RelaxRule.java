package com.hillelPro.havhun.lesson4.enity;

public interface RelaxRule {
    public void relax();
    public default void same(){
        System.out.println("sd");
    };
}
