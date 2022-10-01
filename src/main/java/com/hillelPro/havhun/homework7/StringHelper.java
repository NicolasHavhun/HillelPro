package com.hillelPro.havhun.homework7;

public class StringHelper {

    String name;
    char charExample[];

    public char[] getCharExample() {
        return charExample;
    }

    public void setCharExample(char[] charExample) {
        this.charExample = charExample;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public StringHelper() {
    }

    public StringHelper(String name, char[] charExample) {
        this.name = name;
        this.charExample = charExample;
    }

    public void helper(String name, char[] charExample) {
        if (!(charExample.length == 0)) {
            String stringFromChar = String.valueOf(charExample);
            System.out.println("Your Array is not null: " + stringFromChar);
            if (!(stringFromChar.isEmpty())) {
                System.out.println("Char Array is not empty: " + stringFromChar);
            } else {
                System.out.println("Char Array is empty");
                return;
            }
        } else {
            System.out.println("Array is null");
            return;
        }
        if (!(name.trim().isEmpty())) {
            System.out.println("First String name is not empty : " + name);
        } else {
            System.out.println("First String name is empty, create another string ");
            return;
        }
        if (!(name.trim().isEmpty() && String.valueOf(charExample).trim().isEmpty())) {
            System.out.println("First String to Upper Case: " + name.toUpperCase());
            System.out.println("Second String to Lower Case: " + String.valueOf(charExample).toLowerCase());
        } else {
            return;
        }
        System.out.println("First String withot space: " + name.trim());
        System.out.println("Second String withot space: " + String.valueOf(charExample).trim());
        System.out.println("Concatenation with method .concat: " + name.concat(" " + String.valueOf(charExample).trim()));
        String thirdString = name + " " + String.valueOf(charExample).trim();
        System.out.println("Concatenation from two string: " + thirdString);
        System.out.println("String length: " + thirdString.length());
        if (thirdString.length() % 2 == 0) {
            System.out.println("One symbol of String in the middle: " + thirdString.charAt(thirdString.length() / 2));

        } else {
            System.out.println("Two symbols of String in the middle: " + thirdString.charAt(thirdString.length() / 2) +
                    "" + thirdString.charAt((thirdString.length() / 2) + 1));
        }
    }
}
