package com.hillelPro.havhun.lesson17;

import com.hillelPro.havhun.lesson14.entity.Client;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.*;

public class Main {
    public static void main(String[] args) {
        //@FunctionalInterface - использование для своих интерфейсов:
        //И пример использования lambda-выражений:

//        final DefaultRunInterfaceImpl defaultRunInterfaceImpl = new DefaultRunInterfaceImpl();
//        defaultRunInterfaceImpl.run();

        final DefaultRunInterface defaultRunInterface = () -> System.out.println("I'm running...");
        defaultRunInterface.run();

        final int calculate = calculate(10, 230);
//        (a, b) -> a + b;

        final List<String> stringList = Arrays.asList("one", "two", "three");
        Collections.sort(stringList, (o1, o2) -> o1.compareTo(o2));

        //Существующие функциональные интерфейсы в Java 8:

        final Predicate<String> predicate = (predicateString) -> predicateString.trim().isBlank();
        System.out.println("predicate.test(\"\"): " + predicate.test(""));
        System.out.println("predicate.test(\"string\"): " + predicate.test("string"));
//        System.out.println("predicate.test(null): " + predicate.test(null));

        final Consumer<Integer> consumer = (consumerInteger) -> {
            consumerInteger %= 2;
            System.out.println("consumer get parameter: " + consumerInteger);
        };
        consumer.accept(1000);
        consumer.accept(3);

        final Function<Double, Boolean> function = (functionDouble) -> functionDouble.isInfinite();
        System.out.println("function.apply(12.54): " + function.apply(12.54));

        final Supplier<Client> supplier = () -> new Client();
        final Client client = supplier.get();

        final BiPredicate<String, String> biPredicate = (firstString, secondString) -> firstString.length() > secondString.length();
        System.out.println("biPredicate.test(\"sdfsdf\", \"sdfsdgfsdgsdg\"): " + biPredicate.test("sdfsdf", "sdfsdgfsdgsdg"));
        System.out.println("biPredicate.test(\"sdfsdgfsdgsdg\", \"sdfsdf\"): " + biPredicate.test("sdfsdgfsdgsdg", "sdfsdf"));

        final BiFunction<Integer, Double, String> biFunction =
                (functionInteger, functionDouble) -> functionInteger + "/" + functionDouble;
        final String applyResult = biFunction.apply(145, 658.45);
        System.out.println("applyResult is: " + applyResult);

//        final Function<String, String> stringStringFunction = (str) -> str.concat("changed");
//        final BiFunction<Integer, Integer, Integer> integerIntegerIntegerBiFunction = (int1, int2) -> int1 + int2;
        final UnaryOperator<String> unaryOperator = (str) -> str.concat("changed");
        final BinaryOperator<Integer> binaryOperator = (int1, int2) -> int1 + int2;

        final Calculator<Integer, Long, Float, Double, String> calculator =
                (aInteger, aLong, aFloat, aDouble) -> String.valueOf(aInteger + aLong + aFloat + aDouble);
        final String sumString = calculator.sum(100, 500400L, 15.43F, 789.958);
        System.out.println("sumString: " + sumString);
    }

    public static int calculate(Integer a, int b) {
        return a + b;
    }


}
