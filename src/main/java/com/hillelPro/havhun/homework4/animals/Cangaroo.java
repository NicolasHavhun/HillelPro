package com.hillelPro.havhun.homework4.animals;

import com.hillelPro.havhun.homework4.interfaces.GiveMilk;
import com.hillelPro.havhun.homework4.interfaces.BehaviorAnimal;

final public class Cangaroo extends Diprotodontia implements BehaviorAnimal, GiveMilk {
    private String name;
    public int height;

    public void jumpFar(){
        System.out.println("Cangaroo can jump far");
    }
    @Override
    public void born() {
        super.born();
        System.out.println("Cangaroo born");
    }

    @Override
    public void reproduce() {
        System.out.println("Cangaroo reproduce");

    }

    @Override
    public void giveMilk() {
        System.out.println("Cangaroo give milk");

    }

    @Override
    public void moveAnimal() {
        System.out.println("Cangaroo move");

    }

    @Override
    public void runAnimal() {
        System.out.println("Cangaroo run");

    }

    @Override
    public void jumpAnimal() {
        System.out.println("Cangaroo jump");
    }

    @Override
    public void fightAnimal() {
        System.out.println("Cangaroo fight");

    }

    public Cangaroo() {
    }

    public Cangaroo(String name, boolean live, boolean die, boolean sleep, boolean eat, int height) {
        super(live, die, sleep, eat);
        this.name = name;
        this.height = height;

    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
