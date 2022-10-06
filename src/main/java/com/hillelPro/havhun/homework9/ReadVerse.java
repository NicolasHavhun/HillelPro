package com.hillelPro.havhun.homework9;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadVerse {
    public static void read() throws IOException {
        final FileReader fileReader = new FileReader("src/main/java/resources/verse/verse.txt");
        final Scanner scanner = new Scanner(fileReader);
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
        scanner.close();
        fileReader.close();

    }
}
