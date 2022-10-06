package com.hillelPro.havhun.homework9;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class WriteVerse {
    public void write(String verse) throws IOException {
        final String path = "src/main/java/resources/verse/verse.txt";
        final Path pathToFile = Paths.get(path);
        if (!Files.exists(pathToFile.getParent())) {
            Files.createDirectories(pathToFile.getParent());
            System.out.println("New directory was created: " + path);
        }
        FileWriter fileWriter = new FileWriter(path);
        fileWriter.write(verse);
        fileWriter.close();
        System.out.println("Text was recorded and saved");
    }
}


