package com.hillelPro.havhun.lesson18;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Stream<Object> empty = Stream.empty(); // empty
        Stream.of("1", "2");
        IntStream.of(1,2,3);

       Stream<String> stringStream =   Stream.of("first", "second", "third");
//        Stream<String> stream = stringStream.filter(var -> var.length() > 3)
//                .skip(0)
//                .distinct()
//                .map(element -> {
//                    System.out.println(element+"\"");
//                    return element +""+ " mapped";
//                })
//                .limit(4)
//                .sorted();
//                .mapToInt(digit -> Integer.valueOf(digit));
//        Optional<String> first = stream.findFirst();
//        System.out.println(first.get());
// Optional<String> firstdf = stream.findFirst();
//        System.out.println(first);

//        ArrayList<String> collect = sorted.collect(Collectors.toList());
        stringStream.parallel();
        Function<String, Integer> function = Integer::parseInt;
        System.out.println(function.apply("1"));

        Integer integer = 5;
        Supplier<String> supplier = integer::toString;
        String supplierResult = supplier.get();

        Function<String, String> stringStringFunction = String:: toLowerCase;
        String someString = stringStringFunction.apply("some STRING");
        System.out.println(someString);

        Date date = new Date();
        System.out.println(date.getTime());

        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        LocalDate.of(2010, 11,4);



    }
}
