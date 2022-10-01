package com.hillelPro.havhun.lesson9;

import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String str = "    my string" + " is final\t";
//        str+="!!!";
//        System.out.println(str);

//        str.length();
        System.out.println(str.length() + " length\t");
//        if (str.length() > 15) {
//            System.out.println("name is so large");
//        }

//        char[] chars = str.toCharArray();
//        for (int i=0; i< chars.length; i++)
//
//        System.out.println(chars[i]);

        System.out.println(str.trim().length() + " str.trim().length()");
        System.out.println(str.isEmpty() + " str.isEmpty()");
        System.out.println("".isEmpty() + " str.isEmpty()");
        String valueOf = String.valueOf(305);
        System.out.println(valueOf);
        System.out.println(str.charAt(8));

        int i;
        for (i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }

//        int concatS= str.trim().concat(" "+"zxc");
        System.out.println();
        System.out.println(str.equals(""));
        String lowerCase = str.toLowerCase();
        String upperCase = str.toUpperCase();
        System.out.println(lowerCase.equals(upperCase));

        boolean matches = "examplei".matches("(i)*^%");
        System.out.println(matches);
        String fewWords= "One two three";
        String[] words = fewWords.split("");
        for (String word : words){
            System.out.print(word);
        }
        System.out.println();
        System.out.println(fewWords.replaceAll("e", "EEE"));
        for (String word : words){
            System.out.println(word);

        }
        System.out.println(fewWords.replaceAll("e", "E"));

//        string format
        int j=25;
        String format = String.format("string from lesson :%s, with int %d", str, j);
        System.out.println(format);
        //pettern

        Pattern pattern = Pattern.compile("^e", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("Example");
        boolean match = matcher.matches();
        boolean find = matcher.find();
        System.out.println(find);
        System.out.println(match);

    }
}
