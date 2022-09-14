package com.hillelPro.havhun.lesson5;

import com.hillelPro.havhun.lesson5.enity.Hero;
import com.hillelPro.havhun.lesson5.service.BigArenaService;
import com.hillelPro.havhun.lesson5.service.SmallArenaService;

public class Main {
    public static void main(String[] args) {
        Game game = new Game();
        final Hero first = game.choiceHero();
        final Hero second = game.choiceHero();
        game.setDataToHero(first);
        game.setDataToHero(second);

        SmallArenaService smallArenaService = new SmallArenaService();
        BigArenaService bigArenaService = new BigArenaService();

        smallArenaService.fight(first ,second);
        bigArenaService.fight(first,second);

    }

}
