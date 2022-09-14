package com.hillelPro.havhun.lesson5.service;

import com.hillelPro.havhun.lesson5.enity.Hero;

public abstract class Action implements ArenaAction{


    @Override
    public void fight(Hero first, Hero second) {
        if(first.getHealth()>second.getHealth()&&first.getSpeed()>second.getSpeed()){
            System.out.println(first.getName()+"is winner");
        } else if(first.getPower()<second.getPower()){
            System.out.println(second.getName()+"is winner");
        }

    }
}
