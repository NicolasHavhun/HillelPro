package com.hillelPro.havhun.homework4;

public class Main {
    public static void main(String[] args) {
        Cabbage cabbage = new Cabbage("Cabbage", true, false,true, true, 90, 2.5);
        cabbage.cabbageForSalad();
        cabbage.bearFruit();
        cabbage.grove();
        cabbage.applyFungicides();
        cabbage.removeWeeds();
        cabbage.plantsNeedToSun();
        cabbage.plantsNeedToWater();


    }
}
