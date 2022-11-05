package com.hillelPro.havhun.homework14;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.function.*;

public class Main {
    public static void main(String[] args) {
//        1.
        final Predicate<Double> predicate = (predicateDouble) -> (predicateDouble > 1500.0);
        System.out.println("predicate.test(1000.1): " + predicate.test(1000.1));
        System.out.println("predicate.test(10200.1): " + predicate.test(10200.1));
//         2.
        final Consumer<String> consumer = (consumerString) -> {

            System.out.println("Строка: " + consumerString);
            System.out.println("Массив символов: " + Arrays.toString(consumerString.toCharArray()));

        };
        consumer.accept("Проверочный текст");
//      3.
        final Function<Integer, String> function = Main::returnIntToWord;
        String result = function.apply(1);
        String resultTwo = function.apply(-24);
        String resultThree = function.apply(0);
        System.out.println("result Function Integer ONE : " + result);
        System.out.println("resultTwo: " + resultTwo);
        System.out.println("resultThree: " + resultThree);
//        4.
        final Supplier<Number> stringSupplier = () -> 12.25 + 12.3;
        stringSupplier.get();
        System.out.println("stringSupplier.get() : " + stringSupplier.get());
//        5.
        BiFunction<Double, Integer, String> stringBiFunction = (doubleBi, intBi) -> {
            double resultD = doubleBi - intBi;
            if (resultD < 1) {
                return "BiFunction remainder < 1";
            }
            return String.valueOf(resultD);
        };
        String applyResult = stringBiFunction.apply(3.5, 1);
        String applyResult2 = stringBiFunction.apply(999.0, 1998);
        System.out.println("applyResult: " + applyResult);
        System.out.println("applyResult2: " + applyResult2);
//        6.

        final FiveDigitFunction<Byte, Short, Integer, Long, String> fiveDigitFunction =
                Main::sum;

        String fiveDigitFunctionSum = fiveDigitFunction.sum((byte) 81, (short) 16, 64, 128L);
        System.out.println("Square root of sum numbers: " + fiveDigitFunctionSum);
//       7.
        final BooleanSupplier leapYear = () -> LocalDate.now().isLeapYear();

        System.out.println("Is 2022 a leap year? " + leapYear.getAsBoolean());

    }

    private static String returnIntToWord(Integer number) {
        String string = null;
        switch (number) {
            case 1:
                string = "One";
                break;
            case 2:
                string = "Two";
                break;
            case 3:
                string = "Three";
                break;
            case 4:
                string = "Four";
                break;
            case 5:
                string = "Five";
                break;
            case 6:
                string = "Six";
                break;
            case 7:
                string = "Seven";
                break;
            case 8:
                string = "Eight";
                break;
            case 9:
                string = "Nine";
                break;
            case 10:
                string = "Ten";
                break;
            default:
                string = "unknown";
        }
        return string;
    }

    private static String sum(Byte byteFive, Short shortFive, Integer intFive, Long longFive) {
        return String.valueOf(Math.sqrt((byteFive + shortFive + intFive + longFive)));
    }
}




