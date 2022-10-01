package com.hillelPro.havhun.lesson10;

import java.io.IOException;
import java.nio.channels.AcceptPendingException;
import java.nio.file.FileSystemException;
import java.util.Random;

public class ExceptionServise {
    public void throwCheckedException() throws IOException {
        throw new IOException();
    }

    public void throwUncheckedException(){
        throw new RuntimeException();
    }
    public  void throwTwoCheckedException() throws AcceptPendingException, FileSystemException{
        int anInt = new Random().nextInt();
        if (anInt<0){
            throw new AcceptPendingException();
        } else {
        throw new FileSystemException("file");
        }

    }
}
