package com.hillelPro.havhun.lesson20;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        String stringForCheck = "string for Check1 ";
        String stringForCheck2 = "string for Check2 ";
        String stringForCheck3 = "string for Check3 ";
        final Function<String, String> function = (str) -> str.trim().repeat(5);
        System.out.println(function.apply(stringForCheck));
        System.out.println(checkAndValidateString(stringForCheck2));
        System.out.println(function.apply(stringForCheck3));
        StringService stringService = new StringService();
        List<Integer> integer = List.of(1, 2, 3, 4);
        integer.stream().
                map(stringService::checkIntAndConvertToString).
                toArray();
    }

    /**
     * @param str
     * @return
     */
    private static Optional<String> checkAndValidateString(String str) {
        return Optional.of(str.trim().repeat(5).concat(" : the end"));
    }
}
