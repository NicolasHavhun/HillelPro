package com.hillelPro.havhun.homework4;

import com.hillelPro.havhun.homework4.interfaces.BrassicaGrows;

final class Broccoli extends Brassica implements BrassicaGrows {

    String broccoliName;

    public void broccoliIsHealty() {
        System.out.println("Broccoli Is Healty!!!");
    }

    @Override
    protected void bearFruit() {
        System.out.println("Broccoli bear fruits");

    }

    @Override
    protected void grove() {
        System.out.println("Broccoli grove");
    }

    @Override
    public void applyFungicides() {
        System.out.println("For Broccoli apply Fungicides");
    }

    @Override
    public void removeWeeds() {
        System.out.println("Broccoli need to remove weeds");
    }

    @Override
    public void plantsNeedToSun() {
        System.out.println("Broccoli Need to Sun");
    }

    @Override
    public void plantsNeedToWater() {
        System.out.println("Broccoli Need to Water");
    }

    public Broccoli() {
    }

    public Broccoli(String broccoliName, boolean live, boolean die, boolean showGreen, boolean reproduce, int numberOfDaysMaturation, double weightOfFruit) {
        super(live, die, showGreen, reproduce, numberOfDaysMaturation, weightOfFruit);
        this.broccoliName=broccoliName;
    }

    public String getBroccoliName() {
        return broccoliName;
    }

    public void setBroccoliName(String broccoliName) {
        this.broccoliName = broccoliName;
    }
}



