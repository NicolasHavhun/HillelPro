package com.hillelPro.havhun.homework4;

abstract class Brassica extends Plant {

    protected boolean showGreen;
    protected boolean reproduce;
    protected int numberOfDaysMaturation;
    protected double weightOfFruit;

    protected abstract void bearFruit();

    public Brassica() {
    }

    public Brassica(boolean live, boolean die, boolean showGreen, boolean reproduce, int numberOfDaysMaturation, double weightOfFruit) {
        super(live, die);
        this.showGreen = showGreen;
        this.reproduce = reproduce;
        this.numberOfDaysMaturation = numberOfDaysMaturation;
        this.weightOfFruit = weightOfFruit;
    }

    public boolean isShowGreen() {
        return showGreen;
    }

    public void setShowGreen(boolean showGreen) {
        this.showGreen = showGreen;
    }

    public boolean isReproduce() {
        return reproduce;
    }

    public void setReproduce(boolean reproduce) {
        this.reproduce = reproduce;
    }

    public int getNumberOfDaysMaturation() {
        return numberOfDaysMaturation;
    }

    public void setNumberOfDaysMaturation(int numberOfDaysMaturation) {
        this.numberOfDaysMaturation = numberOfDaysMaturation;
    }

    public double getWeightOfFruit() {
        return weightOfFruit;
    }

    public void setWeightOfFruit(double weightOfFruit) {
        this.weightOfFruit = weightOfFruit;
    }
}
