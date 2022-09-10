package com.hillelPro.havhun.lesson4;

import com.hillelPro.havhun.lesson4.enity.Firemen;
import com.hillelPro.havhun.lesson4.enity.Human;
import com.hillelPro.havhun.lesson4.enity.Men;
import com.hillelPro.havhun.lesson4.enity.Woman;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        double first = 10.0;
        double second = 13.2;
         final double plus=  calculator.plus(first, second);
        System.out.println("Calculator ="+plus);


        Woman woman = new Woman();
        Firemen firemen = new Firemen();

        woman.work();

        firemen.work();
        firemen.relax();
        firemen.study();
        firemen.same();

      //  AbstractExample.AbstractExampleClas abstractExampleClas = new AbstractExample.AbstractExampleClas();

    }
}
