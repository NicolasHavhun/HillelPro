package com.hillelPro.havhun.homework15;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
//        1.
        final Stream<Object> empty = Stream.empty().
                distinct().
                sorted().
                limit(10);
        System.out.println("1. Empty;/");

//        2.
        final Stream<String> stringStream = Stream.of("1", "3", "12", "24", "60", "36", "48", "");
        Stream<String> intermediateOperators = stringStream.skip(3).sorted();
        System.out.println("2. Data set: " + intermediateOperators.collect(Collectors.toSet()));


//        3.
        Stream<String> foodBasket = Stream.of("bread", "butter", "cheese", "milk");
        System.out.println("3. Food Basket: ");
        foodBasket.forEach(s -> System.out.println(s));
        System.out.println();

//        4.
        HashMap<Integer, Integer> homeworks = new HashMap<>();
        homeworks.put(1, 99);
        homeworks.put(2, 92);
        homeworks.put(3, 85);
        homeworks.put(4, 97);
        homeworks.put(5, 100);
        List<Integer> collectionNames;
        collectionNames = homeworks.keySet().stream()
                .map(key -> {
                    System.out.println(homeworks.get(key));
                    return homeworks.get(key);
                })
                .collect(Collectors.toList());
        System.out.println("4. Collection of values: " + collectionNames);
//        5.
        List<String> listOfNumbers = Arrays.asList("2", "14", "59", "87", "4", "45", "23", "99", "-28", "-28");
        Set<Integer> integerSet = listOfNumbers.stream()
                .skip(1)
                .limit(8)
                .map(Integer::parseInt)
                .filter(intList -> intList % 2 == 0)
                .collect(Collectors.toSet());
        System.out.println("5. Unique values: " + integerSet);
//        6.
        System.out.println("\nПараллельный поток");
        DoubleStream doubleStream = DoubleStream.of(24.0, 21.2, 45.45, 56, 7, 99.9);
        OptionalDouble firstElement = doubleStream
                .parallel()
                .sorted()
                .filter(value -> value >= 57)
                .findFirst();
        System.out.println("6. First element: " + firstElement);
//        7.
        Client nico = new Client("Nico", 25, Gender.Man);
        Client max = new Client("Max", 34, Gender.Man);
        Client joe = new Client("Joe", 24, Gender.Man);
        Client anna = new Client("Anna", 16, Gender.Woman);
        Collection<Client> clients = Arrays.asList(
                nico,
                max,
                joe,
                anna);


        System.out.println("7. Method reference::"+clients.stream()
//                .map(Client::new)
                .filter(Main::testIfMan)
                .filter(nico::goToTheArmy)
                .map(Client::toString)
                .collect(Collectors.toList()));


    }

    private static boolean testIfMan(Client s) {
        return s.getGender() == Gender.Man;
    }

}
