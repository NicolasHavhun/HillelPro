package com.hillelPro.havhun.homework9;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        WriteVerse writeVerse = new WriteVerse();
        ReadVerse readVerse = new ReadVerse();
        ValidationService validationService = new ValidationService();
        final String verse = "Над хвилями моря, на скелі,\n" +
                "Хороша дівчина сидить,\n" +
                "В лавровім вінку вона сяє,\n" +
                "Співецькую ліру держить.\n";
        writeVerse.write(verse);
        System.out.println("The verse by Lesya Ukrainka: ");
        readVerse.read();
        System.out.println("Validation service with method registration");
        validationService.registration();
        System.out.println("Validation service with method login");
        validationService.login();
    }
}
