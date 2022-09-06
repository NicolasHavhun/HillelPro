package com.hillelPro.havhun.homework2;

public class PartTwoClass {
    final int CONSTANT_ONE = 25;
    final double CONSTANT_TWO = 9.8;
    final boolean CONSTANT_THREE = false;


    public PartTwoClass() {
    }

    //В связи с тем, что к параметрам класса присвоен модификатор доступа final, эти параметры не могут быть изменены, переназначены.
    // Поэтому конструктор с параметрами final создать нельзя.
    // Setter от поля final создать нельзя.

    // public PartTwoClass(int CONSTANT_ONE) {
    // this.int CONSTANT_ONE=CONSTANT_ONE;
    // }

    // public PartTwoClass(int CONSTANT_ONE, double CONSTANT_TWO) {
    // this.int CONSTANT_ONE = CONSTANT_ONE;
    // this.double CONSTANT_TWO = CONSTANT_TWO;
    // }

    // public PartTwoClass(int CONSTANT_ONE, double CONSTANT_TWO, boolean CONSTANT_THREE) {
    // this.int CONSTANT_ONE = CONSTANT_ONE;
    // this.double CONSTANT_TWO = CONSTANT_TWO;
    // this.boolean CONSTANT_THREE = CONSTANT_THREE;
    // }
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
