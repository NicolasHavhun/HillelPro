package com.hillelPro.havhun.lesson16.service;

public class PrintFactory implements PrintService, DefaultService {
    // Первое решение проблемы множественной имплементации интерфейсов с ОДИНАКОВЫМ default методом!!!
//    @Override
//    public String printAndReturnResult(final String stringForPrint) {
//        final String result = "RESULT OF PRINT: ".concat(stringForPrint);
//        System.out.println(result);
//        return result;
//    }

}
