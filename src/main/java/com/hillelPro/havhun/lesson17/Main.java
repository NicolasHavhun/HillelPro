package com.hillelPro.havhun.lesson17;

import com.hillelPro.havhun.lesson14.entity.Client;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.*;

public class Main {
    public static void main(String[] args) {
        DefaultRunInterface defaultRunInterface = new DefaultRunInterface() {
            @Override
            public void run() {
                System.out.println("i'm running");
            }
        };
        defaultRunInterface.run();
        final int ccalculate = calculate(10, 20);
        int c = 10;
        int d = 30;

        List<String> stringList = Arrays.asList("one", "two", "three");
        Object Comparator;
        Collections.sort(stringList, (o1, o2) -> 0);

        Predicate<String> predicate = (string) -> string.trim().isBlank();
        System.out.println(predicate.test(""));
        System.out.println(predicate.test("string"));
//        System.out.println(predicate.test(null));

        final Consumer<Integer> consumer = (consumerInteger) ->
                System.out.println("consumer get parameter" + consumerInteger);
        consumer.accept(1000);

        final Function<Double, Boolean> function = (functionalDouble) ->
                functionalDouble.isInfinite();
        System.out.println("functional Double: " + function.apply(12.54));

        final Supplier<Client> supplier = () -> new Client();
        Client client = supplier.get();

        final BiPredicate<String, String> biPredicate = (firstString, secondString) ->
                firstString.length() > secondString.length();
        System.out.println(biPredicate.test("wSDFF", "wert"));

        final BiFunction<Integer,Double, String> biFunction = (functionInt, functionDouble) ->
                functionInt+ ""+functionDouble;
        String Result = biFunction.apply(123, 234.45);
        System.out.println("result: "+Result);

        final BinaryOperator<Integer> binaryOperator = (int1, int2) -> int1+int2;

    }

    public static int calculate(int a, int b) {
        return a + b;
    }

}
