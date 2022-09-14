package com.hillelPro.havhun.homework4;

import com.hillelPro.havhun.homework4.interfaces.BrassicaGrows;

final class BrusselsSprout extends Brassica implements BrassicaGrows {

    String brusselsSproutName;
    public void brusselsSproutFrozen() {
        System.out.println("Brussels Sprout can be frozen");
    }

    @Override
    protected void bearFruit() {
        System.out.println("Brussels Sprout bear fruits");

    }

    @Override
    protected void grove() {
        System.out.println("Brussels Sprout grove");
    }

    @Override
    public void applyFungicides() {
        System.out.println("For Brussels Sprout apply Fungicides");
    }

    @Override
    public void removeWeeds() {
        System.out.println("Brussels Sprout need to remove weeds");
    }

    @Override
    public void plantsNeedToSun() {
        System.out.println("Brussels Sprout Need to Sun");
    }

    @Override
    public void plantsNeedToWater() {
        System.out.println("Brussels Sprout Need to Water");
    }

    public BrusselsSprout() {
    }

    public BrusselsSprout(String brusselsSproutName, boolean live, boolean die, boolean showGreen, boolean reproduce, int numberOfDaysMaturation, double weightOfFruit) {
        super(live, die, showGreen, reproduce, numberOfDaysMaturation, weightOfFruit);
        this.brusselsSproutName= brusselsSproutName;
    }

    public String getBrusselsSproutName() {
        return brusselsSproutName;
    }

    public void setBrusselsSproutName(String brusselsSproutName) {
        this.brusselsSproutName = brusselsSproutName;
    }
}
