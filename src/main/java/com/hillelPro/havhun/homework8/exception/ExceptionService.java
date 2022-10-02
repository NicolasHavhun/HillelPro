package com.hillelPro.havhun.homework8.exception;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionService {


    public void UserExpectedError() {
        throw new ArithmeticException();
    }

    public void WrongFieldException(){
        try {
            throw new FileNotFoundException();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    public void WrongSumException(){
        try {
            throw new IOException();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
