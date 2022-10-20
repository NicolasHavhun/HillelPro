package com.hillelPro.havhun.homework11;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        InitializationData initializationData = new InitializationData();
        initializationData.getSetDataForTest();
        HashMap<String, String> stringStringHashMap = new HashMap<>();

        System.out.println(stringStringHashMap);
        System.out.println(stringStringHashMap.size());

    }
}
