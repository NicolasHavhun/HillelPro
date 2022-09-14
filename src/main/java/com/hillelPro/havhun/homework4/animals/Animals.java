package com.hillelPro.havhun.homework4.animals;

public abstract class Animals {
    public boolean live;
    public boolean die;

    public abstract void born();

    public Animals() {
    }

    public Animals(boolean live, boolean die) {
        this.live = live;
        this.die = die;
    }

    public boolean isLive() {
        return live;
    }

    public boolean isDie() {
        return die;
    }

    public void setLive(boolean live) {
        this.live = live;
    }

    public void setDie(boolean die) {
        this.die = die;
    }
}
