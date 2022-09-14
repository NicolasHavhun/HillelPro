package com.hillelPro.havhun.homework4.animals;

import com.hillelPro.havhun.homework4.interfaces.GiveMilk;
import com.hillelPro.havhun.homework4.interfaces.BehaviorAnimal;

final public class Coala extends Diprotodontia implements BehaviorAnimal, GiveMilk {
    public int height;
    public int weight;
    public void climbTrees(){
        System.out.println("Coala can climb on Trees");
    }
    @Override
    public void born() {
        super.born();
        System.out.println("Coala born");
    }

    @Override
    public void reproduce() {
        System.out.println("Coala reproduce");

    }

    @Override
    public void giveMilk() {
        System.out.println("Coala give milk");

    }

    @Override
    public void moveAnimal() {
        System.out.println("Coala move");

    }

    @Override
    public void runAnimal() {
        System.out.println("Coala run");

    }

    @Override
    public void jumpAnimal() {
        System.out.println("Coala jump");

    }

    @Override
    public void fightAnimal() {
        System.out.println("Coala fight");

    }

    public Coala() {
    }

    public Coala(boolean live, boolean die, boolean sleep, boolean eat, int height, int weight) {
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
