package com.hillelPro.havhun.homework4;

abstract class Plant {

    protected boolean live;
    protected boolean die;

    protected abstract void grove();

    public Plant(boolean live, boolean die) {
        this.live = live;
        this.die = die;
    }
}
