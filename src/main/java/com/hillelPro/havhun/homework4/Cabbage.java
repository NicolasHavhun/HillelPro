package com.hillelPro.havhun.homework4;

import com.hillelPro.havhun.homework4.interfaces.BrassicaGrows;

final class Cabbage extends Brassica implements BrassicaGrows {

    String cabbageName;



    public void cabbageForSalad() {
        System.out.println("Make cabbage salad");
    }

    @Override
    protected void bearFruit() {
        System.out.println("Cabbage bear fruits");
    }

    @Override
    protected void grove() {
        System.out.println("Cabbage grove");
    }

    @Override
    public void applyFungicides() {
        System.out.println("For Cabbage apply Fungicides");
    }

    @Override
    public void removeWeeds() {
        System.out.println("Cabbage need to remove weeds");
    }

    @Override
    public void plantsNeedToSun() {
        System.out.println("Cabbage Need to Sun");
    }

    @Override
    public void plantsNeedToWater() {
        System.out.println("Cabbage Need to Water");
    }

    public String getCabbageName() {
        return cabbageName;
    }

    public void setCabbageName(String cabbageName) {
        this.cabbageName = cabbageName;
    }

    public Cabbage() {
    }

    public Cabbage(String cabbageName, boolean live, boolean die, boolean showGreen, boolean reproduce, int numberOfDaysMaturation, double weightOfFruit) {
        super(live, die, showGreen, reproduce, numberOfDaysMaturation, weightOfFruit);
        this.cabbageName = cabbageName;
    }
}
