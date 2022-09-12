package com.hillelPro.havhun.homework4;

abstract class Brassica extends Plant {

    protected boolean showGreen;
    protected boolean reproduce;
    protected int numberOfDaysMaturation;
    protected double weightOfFruit;

    protected abstract void bearFruit();


    public Brassica(boolean live, boolean die, boolean showGreen, boolean reproduce, int numberOfDaysMaturation, double weightOfFruit) {
        super(live, die);
        this.showGreen = showGreen;
        this.reproduce = reproduce;
        this.numberOfDaysMaturation = numberOfDaysMaturation;
        this.weightOfFruit = weightOfFruit;
    }
}
