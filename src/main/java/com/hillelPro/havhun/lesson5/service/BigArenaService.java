package com.hillelPro.havhun.lesson5.service;

import com.hillelPro.havhun.lesson5.enity.Hero;

public class BigArenaService extends Action implements  BigArenaAction{


    @Override
    public void fight(Hero first, Hero second, Hero third) {
        if (first.getPower()> second.getPower()&&first.getPower()> third.getPower()){
            System.out.println(first.getName()+"is winner");
         } else if(second.getPower()> first.getPower()&&second.getPower()> third.getPower()){
        System.out.println(second.getName()+"is winner");

    }

    }

    @Override
    public void fight(Hero first, Hero second) {
        super.fight(first, second);
    }
}
