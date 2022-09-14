package com.hillelPro.havhun.homework4.animals;

import com.hillelPro.havhun.homework4.interfaces.GiveMilk;
import com.hillelPro.havhun.homework4.interfaces.BehaviorAnimal;

final public class Petauridae extends Diprotodontia implements BehaviorAnimal, GiveMilk {
    public int height;
    public int weight;

    public void fly() {
        System.out.println("Petauridae can fly");
    }

    @Override
    public void born() {
        super.born();
        System.out.println("Petauridae born");
    }

    @Override
    public void reproduce() {
        System.out.println("Petauridae reproduce");

    }


    @Override
    public void giveMilk() {
        System.out.println("Petauridae give milk");

    }

    @Override
    public void moveAnimal() {
        System.out.println("Petauridae move");

    }

    @Override
    public void runAnimal() {
        System.out.println("Petauridae run");

    }

    @Override
    public void jumpAnimal() {
        System.out.println("Petauridae jump");

    }

    @Override
    public void fightAnimal() {
        System.out.println("Petauridae fight");

    }

    public Petauridae() {
    }

    public Petauridae(boolean live, boolean die, boolean sleep, boolean eat, int height, int weight) {
        super(live, die, sleep, eat);
        this.height = height;
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
