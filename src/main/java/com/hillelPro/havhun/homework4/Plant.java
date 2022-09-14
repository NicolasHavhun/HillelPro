package com.hillelPro.havhun.homework4;

abstract class Plant {

    protected boolean live;
    protected boolean die;

    protected abstract void grove();

    public Plant() {
    }

    public Plant(boolean live, boolean die) {
        this.live = live;
        this.die = die;
    }

    public boolean isLive() {
        return live;
    }

    public void setLive(boolean live) {
        this.live = live;
    }

    public boolean isDie() {
        return die;
    }

    public void setDie(boolean die) {
        this.die = die;
    }
}
