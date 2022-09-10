package com.hillelPro.havhun.lesson4.enity;

public class Firemen extends Men implements Rule {





    public Firemen() {

    }

    @Override
    public void relax() {
        System.out.println("Fireman Ralax");
    }

    @Override
    public void work() {
        System.out.println("Fireman Work");
    }

    @Override
    public void study() {
        System.out.println("Fireman Study");

    }
}
