package com.hillelPro.havhun.lesson8;

import com.hillelPro.havhun.lesson8.entity.Cat;

public class Main {
    public static void main(String[] args) {
//        Cat cat = new Cat();
//        cat.toString();
////        int value=10;
////        value.toString();
//
//        Object objecta = new Object();
//        Object object2 = new Object();
//
//        Class<?> aClass = objecta.getClass();
//        int hashCode = objecta.hashCode();
//        int hashCode2 = object2.hashCode();
//        System.out.println("hashCode "+hashCode);
//        System.out.println("hashCode2 "+hashCode2);
//
//        System.out.println(objecta.equals(object2));
//        object2=objecta;
//        System.out.println(objecta==object2);
//        System.out.println("objecta.toString()"+objecta.toString());

//        objecta.clone();//нужно реализов доп интерфейс

//        objecta.notify(); методы для многопоточности
//        objecta.notifyAll();
//        objecta.finalize();
//        objecta.wait();
//          Работа со сравнением объектов

//        House house = new House("Kiyv", "Malinovskogo", "me", "13");
//        House youHouse = new House("Lviv", "Sadova", "you", "25");
//        House yourSameHouse = new House("Lviv", "Sadova", "you", "25");
//        System.out.println(house.equals(youHouse));
//        System.out.println(youHouse.equals(yourSameHouse));
//        System.out.println(house.hashCode());
//        System.out.println(youHouse.hashCode());
//        System.out.println(yourSameHouse.hashCode());

        int val=1000;
        System.out.println("val "+val);
        changesSomePrimitive(val);
        System.out.println("val "+val);
        int primitiveIsReturn = changePrimitiveIsReturn(val);
        System.out.println(primitiveIsReturn);

        Cat cat = new Cat();
        cat.setName("Alex");
        cat.setAge(8);
        System.out.println(cat.getName());
        System.out.println(cat.getAge());
        changeCatName(cat,"Rich",12);
        System.out.println(cat.getName() + cat.getAge());
    }
    private static void changesSomePrimitive(int value){
        value+=5;
        System.out.println("changesSomePrimitive"+value);
    }
    private static int changePrimitiveIsReturn(int value){
        return value+33;
    }

    private static void changeCatName(final Cat cat, final String newName, final int ageCat){
        cat.setName(newName);
        cat.setAge(ageCat);
    }
}
