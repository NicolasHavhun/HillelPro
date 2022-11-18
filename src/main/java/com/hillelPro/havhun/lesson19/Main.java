package com.hillelPro.havhun.lesson19;

import com.hillelPro.havhun.lesson8.entity.Cat;

import java.util.List;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        List<String> strings = List.of("", "two", "three");
        List<Object> objects = List.of("qwerty", 12, new Cat());

//        strings.add("four"); unsupported operation
        Cat cat = new Cat();
//        String name = cat.getName() == null ?: cat.getName();
//        String catName = user ?: user.getCat() ?: get.Cat.get.Name();
        String elvise = null;
        String checkedElvise = Objects.requireNonNullElse(elvise, "default Elvise");
        System.out.println(checkedElvise);
        var integer = 12;
        System.out.println("lesson19".repeat(3));

    }
}
