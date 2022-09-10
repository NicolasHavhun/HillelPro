package com.hillelPro.havhun.lesson4.enity;

import com.hillelPro.havhun.lesson4.DedaultRule;
import com.sun.deploy.security.ruleset.DefaultRule;

public class Human  extends DedaultRule {



    public void work(){
        System.out.println("Human Working");
    }

    @Override
    public void printSomething() {
        System.out.println("SOMETHING");
    }
}
