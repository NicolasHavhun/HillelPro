package com.hillelPro.havhun.lesson5;

import com.hillelPro.havhun.lesson5.enity.Batman;
import com.hillelPro.havhun.lesson5.enity.Hero;
import com.hillelPro.havhun.lesson5.enity.Ironman;
import com.hillelPro.havhun.lesson5.enity.SpiderMan;

import java.util.Scanner;

public class Game {

    private final Scanner scanner= new Scanner(System.in);

    public Game() {
    }

    public Hero choiceHero(){
        System.out.println("Выберите персонажа -1 Batman, 2 - IronMan, 3 - SpiderMan");

        final int heroIndex = scanner.nextInt();
        switch (heroIndex){
            case 1:
                return new Batman("Batman");

            case 2:
                return new Ironman("Ironman");

            case 3:
                return new SpiderMan("Spiderman");

        }
        return null;
    }
    public void setDataToHero(Hero hero){
        System.out.println("choise Power for Hero");
        final int power= scanner.nextInt();
        System.out.println("choise Power for Hero");
        final int health= scanner.nextInt();
        System.out.println("choise Power for Hero");
        final int speed= scanner.nextInt();
    }

}
