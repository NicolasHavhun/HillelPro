package com.hillelPro.havhun.homework3;

public class Main {


    public static void main(String[] args) {
        User user = new User("Nico", "Havhun", "nicolas.havhun@gmail.com", "****", "Male", "Ukraine");
        User.print(user.getName(), user.getSurname(), user.getEmail(), user.getPassword(), user.getSex(), user.getCountry());
        User.read("Hello");
        User.write();
    }
}
