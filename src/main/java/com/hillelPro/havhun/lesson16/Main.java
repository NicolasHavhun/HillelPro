package com.hillelPro.havhun.lesson16;

import com.hillelPro.havhun.lesson16.entity.Information;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        //Interface in Java 8+
//        System.out.println(PrintService.str);
////        PrintService.str = "error case"; // Невозможно переопределить final переменную интерфейса!
//        System.out.println(PrintFactory.str);
//
//        PrintService.printHello();
//        final PrintFactory printFactory = new PrintFactory();
//        final String result = printFactory.printAndReturnResult("LESSON16");
//
////        final ExtraFactory extraFactory = new ExtraFactory();
////        extraFactory.printAndReturnResult("lesson16");
//
//        final MyNewService myNewService = new MyNewService();
//        myNewService.printAndReturnResult("12345678901");

        //Optional from Java 8:

        final Information information = new Information();
//        if (information.getNames() == null) {
//            information.setNames(new ArrayList<>());
//        }
//        information.getNames().add("Alex");

        final Optional<Information> optionalInformation = Optional.of(information);

        // Объект в метод должен передаваться Not Null!
        final Optional<Object> empty = Optional.empty(); // Объект с пустой вложенностью
        final Optional<Information> optionalOfNullable = Optional.ofNullable(information);

        commandsWithOptional(information);
        commandsWithOptional(null);
    }

    /**
     * @return Тот же результат, что и Optional.ofNullable(stringForOptional)
     */
    private Optional<String> checkAndReturnOptionalResult(final String stringForOptional) {
        if (stringForOptional == null) {
            return Optional.empty();
        }
        return Optional.of(stringForOptional);
    }

    private String checkAndReturnResult(final String stringForOptional) {
        //the same logic without Optional...
        return null;
    }

    private static void commandsWithOptional(final Information information) {
        final Optional<Information> optionalOfNullable = Optional.ofNullable(information);

        System.out.println("optionalOfNullable.isPresent(): " + optionalOfNullable.isPresent());

        if (optionalOfNullable.isPresent()) {
            System.out.println("optionalOfNullable.get(): " + optionalOfNullable.get());
        }

//        final Information info = optionalOfNullable.orElse(null);
        final Information info = optionalOfNullable.orElse(new Information());
//        final Information info;
//        if (optionalOfNullable.isPresent()) {
//            info = optionalOfNullable.get();
//        } else {
//            info = new Information();
//        }

        final Information getInformationResult = optionalOfNullable.orElseThrow();

//        optionalOfNullable.ifPresent();
//        optionalOfNullable.map();
//        optionalOfNullable.filter();
    }

}
