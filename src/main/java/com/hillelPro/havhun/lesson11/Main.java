package com.hillelPro.havhun.lesson11;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
    }
    private static void write() throws IOException {

        FileWriter fileWriter = new FileWriter("src/main/resources/file.txt");
        fileWriter.write("Hello hillel");
        fileWriter.close();
    }

    private static void writeWithCreatingFolder(final String text) throws IOException {
        final String path = "src/main/resources/folder/file.txt";
        final Path pathToFolder = Paths.get(path);
//        if(!(Files.exists(pathToFolder.getParent))){

//        }
//        FileWriter fileWriter = new FileWriter(path);
//        fileWriter.write(text);
//        fileWriter.close();
//
 }
 private static void read(){

 }

}
