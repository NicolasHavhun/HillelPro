package com.hillelPro.havhun.homework4.animals;

public abstract class Animal {
    public boolean live;
    public boolean die;

    public abstract void born();

    public Animal() {
    }

    public Animal(boolean live, boolean die) {
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
