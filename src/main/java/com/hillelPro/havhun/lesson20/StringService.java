package com.hillelPro.havhun.lesson20;

public class StringService {
    public String checkIntAndConvertToString(Integer integer){
        if  (integer>0){
            return  String.valueOf(integer);
        }
        throw new RuntimeException("int<0");
    }
}
