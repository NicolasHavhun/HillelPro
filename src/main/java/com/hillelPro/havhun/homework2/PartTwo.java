package com.hillelPro.havhun.homework2;

public class PartTwo {

    final int CONSTANT_ONE;
    final double CONSTANT_TWO;
    final boolean CONSTANT_THREE;


    // Пустой конструктор нельзя создать, так как все поля надо заполнить через конструктор со всеми параметрами.

    // Setter от поля final создать нельзя.

    // public PartTwoClass(int CONSTANT_ONE) {
    // this.int CONSTANT_ONE=CONSTANT_ONE;
    // }

    // public PartTwoClass(int CONSTANT_ONE, double CONSTANT_TWO) {
    // this.int CONSTANT_ONE = CONSTANT_ONE;
    // this.double CONSTANT_TWO = CONSTANT_TWO;
    // }

    public PartTwo(int CONSTANT_ONE, double CONSTANT_TWO, boolean CONSTANT_THREE, int constant_one, double constant_two, boolean constant_three) {
        this.CONSTANT_ONE = constant_one;
        this.CONSTANT_TWO = constant_two;
        this.CONSTANT_THREE = constant_three;

    }

    public int getCONSTANT_ONE() {
        return CONSTANT_ONE;
    }

    // public void setCONSTANT_ONE(int CONSTANT_ONE) {
    //            this.CONSTANT_ONE = CONSTANT_ONE;
    //        }

    public double getCONSTANT_TWO() {
        return CONSTANT_TWO;
    }

    // public void setCONSTANT_TWO(double CONSTANT_TWO) {
    //            this.CONSTANT_TWO = CONSTANT_TWO;
    //        }

    public boolean isCONSTANT_THREE() {
        return CONSTANT_THREE;
    }

    // public void setCONSTANT_THREE(boolean CONSTANT_THREE) {
    //            this.CONSTANT_THREE = CONSTANT_THREE;
    //        }


}

