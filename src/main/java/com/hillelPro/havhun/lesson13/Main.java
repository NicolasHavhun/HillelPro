package com.hillelPro.havhun.lesson13;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        final ArrayList arrayList = new ArrayList(1000);
        final LinkedList linkedList = new LinkedList();

        arrayList.add("First");
        arrayList.add(2);
        arrayList.add(2);
        System.out.println("arrayList size - " + arrayList.size());
        System.out.println("arrayList " + arrayList);
        arrayList.add(0, "Zero");
        System.out.println("arrayList " + arrayList);
        arrayList.add("Zero");
        System.out.println("arrayList " + arrayList);
        arrayList.set(2, "Second");
        System.out.println("arrayList " + arrayList);

        for (int i = 0; i < arrayList.size(); i++) {
            final Object element = arrayList.get(i);
            System.out.println(element.toString());
        }
        if (!arrayList.isEmpty()) {
            System.out.println("Array is not empty");
        }
        if (arrayList.contains("First")) {
            System.out.println("array list contains First");
        }
        arrayList.remove(3);
        System.out.println("arrayList " + arrayList);
        arrayList.clear();
        System.out.println("arrayList " + arrayList);

        TreeSet treeSet = new TreeSet();
        HashSet hashSet = new HashSet();
        hashSet.add(12345);
        hashSet.contains(12);
        System.out.println("hashSet.contains(12) " + hashSet.contains(12));
        System.out.println(hashSet.toString());
        hashSet.add(123);
        System.out.println(hashSet.toString());
        hashSet.add(1234);
        System.out.println(hashSet.toString());
        hashSet.add(12);
        System.out.println(hashSet.toString());
        hashSet.add(1);
        System.out.println(hashSet.toString());
        hashSet.add("sdf");
        System.out.println(hashSet.toString());
        hashSet.add("dgg");
        System.out.println(hashSet.toString());
        hashSet.add("2");
        System.out.println(hashSet.toString());
        hashSet.add("1");
        System.out.println(hashSet.toString());

        HashMap hashMap = new HashMap();
        hashMap.put(1, "first");
        hashMap.put("Alex", new Human("Alex", 25));
        hashMap.put("Bob", new Human("Bobi", 20));
        System.out.println(hashMap.containsKey("Alex"));
        System.out.println(hashMap.containsValue("Alex"));
        System.out.println(hashMap.size());
        final Set set = hashMap.keySet();
        System.out.println(set);
        System.out.println(hashMap.toString());
        hashMap.get("David");
        System.out.println(hashMap.get("David"));
        ArrayList tests = new ArrayList();
        tests.add("one");
        tests.add("two");
        tests.add("three");
        hashMap.put("Alex", tests);
        System.out.println(hashMap.toString());

    }
}
