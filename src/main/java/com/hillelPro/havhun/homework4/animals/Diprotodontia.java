package com.hillelPro.havhun.homework4.animals;

public abstract class Diprotodontia extends Animal {
   boolean sleep;
   boolean eat;
    @Override
    public void born() {

    }
    public abstract void reproduce();

    public Diprotodontia() {
    }

    public Diprotodontia(boolean live, boolean die, boolean sleep, boolean eat) {
        super(live, die);
        this.sleep = sleep;
        this.eat = eat;
    }

    public boolean isSleep() {
        return sleep;
    }

    public void setSleep(boolean sleep) {
        this.sleep = sleep;
    }

    public boolean isEat() {
        return eat;
    }

    public void setEat(boolean eat) {
        this.eat = eat;
    }
}

