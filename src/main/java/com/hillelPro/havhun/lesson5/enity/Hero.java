package com.hillelPro.havhun.lesson5.enity;

public abstract class Hero {
    private String name;
    private double health;
    private int power;
    private int speed;

    public Hero() {
    }

    public Hero(String name) {
        this.name = name;
    }

    public Hero(String name, double health, int power, int speed) {
        this.name = name;
        this.health = health;
        this.power = power;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
