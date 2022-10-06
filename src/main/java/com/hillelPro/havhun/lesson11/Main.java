package com.hillelPro.havhun.lesson11;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        String text = "Bonjour, Hillel\n";
//        write(text);
//        writeWithCreatingFolder(text);
        read();
    }

    private static void write(String text) throws IOException {

        FileWriter fileWriter = new FileWriter("src/main/java/resources/file1.txt", true);
        fileWriter.write(text);
        fileWriter.close();

    }

    private static void writeWithCreatingFolder(final String text) throws IOException {
        final String path = "src/main/java/resources/folder/file.txt";
        final Path pathToFile = Paths.get(path);
        if (!Files.exists(pathToFile.getParent())) {
            Files.createDirectories(pathToFile.getParent());
        }
        FileWriter fileWriter = new FileWriter(path);
        fileWriter.write(text);
        fileWriter.close();

    }

   private static void read() throws IOException {
            final FileReader fileReader = new FileReader("src/main/java/resources/file.txt");
            final Scanner scanner = new Scanner(fileReader);
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
            scanner.close();
            fileReader.close();


        }
    }




