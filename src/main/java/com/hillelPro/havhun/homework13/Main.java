package com.hillelPro.havhun.homework13;


import com.hillelPro.havhun.homework13.interfaces.Bounceable;
import com.hillelPro.havhun.homework13.interfaces.Flyable;
import com.hillelPro.havhun.homework13.interfaces.Runnable;
import com.hillelPro.havhun.homework13.interfaces.Swimmable;

import java.util.Optional;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
//       4.
        returnPelican();
        returnRabbit();
//       6.
        String email = "nicolas.havhun@gmail.com";
        checkAndReturnResult(email);
        System.out.println("check And Return Result 1: " + checkAndReturnResult(email));
        String email2 = null;
        System.out.println("check And Return Result2: " + checkAndReturnResult(email2));
        String email3 = "";
        System.out.println("check And Return Result 3: " + checkAndReturnResult(email3));
//        7.
        System.out.println("return NoSuchElementException");
        checkAndReturnResult(email).get();
        checkAndReturnResult(null).get();
        checkAndReturnResult(email3).get();
    }

    private static void returnPelican() {
        Pelican pelican = new Pelican();
        pelican.move("Pelican move");
        pelican.diveSwim();
        pelican.floatSwim();
        pelican.takeOffFlyable();
        pelican.fallFlyable();
//        static methods
        Swimmable.swim();
        Flyable.fly();
    }

    private static void returnRabbit() {
        Rabbit rabbit = new Rabbit();
        rabbit.move("Rabbit move");
        rabbit.accelerateRun();
        rabbit.brakeRun();
        rabbit.jumpOverObstacles();
        rabbit.jumpUnderground();
//        static methods
        Runnable.run();
        Bounceable.bounce();
    }

    //5.
    private static Optional<String> checkAndReturnResult(String stringForOptional) {
//        from homework N7
        String str = "^[\\p{L}0-9!#$%&'*+\\/=?^_`{|}~-][\\p{L}0-9.!#$%&'*+\\/=?^_`{|}~-]{0,63}@[\\p{L}0-9-]+(?:\\.[\\p{L}0-9-]{2,7})*$";

        if (stringForOptional != null && !stringForOptional.isBlank() && Pattern.compile(str).matcher(stringForOptional).matches()) {
            System.out.println("Email is Valid");
            return Optional.of(stringForOptional);
        }
        System.out.println("Email is Invalid");
        return Optional.empty();
    }
}
