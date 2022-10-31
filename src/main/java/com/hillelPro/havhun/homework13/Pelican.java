package com.hillelPro.havhun.homework13;

import com.hillelPro.havhun.homework13.interfaces.Flyable;
import com.hillelPro.havhun.homework13.interfaces.Swimmable;

public class Pelican implements Swimmable, Flyable {
    @Override
    public String move(String stringForPrint) {
        return Swimmable.super.move(stringForPrint);
    }

    @Override
    public void diveSwim() {
        System.out.println("Pelican dive down");
    }

    @Override
    public void floatSwim() {
        System.out.println("Pelican float up");
    }

    @Override
    public void fallFlyable() {
        System.out.println("Pelican fall");
    }

    @Override
    public void takeOffFlyable() {
        System.out.println("Pelican take off");
    }
}
