package com.hillelPro.havhun.homework3;

import java.util.Objects;
import java.util.Scanner;

public class User {
    private String name;
    private String surname;
    private String email;
    private String password;
    private String sex;
    private String country;

    public String firstString = "Восьмая джава это круто!\n" +
            "Она продвинута весьма\n" +
            "Аж даже final добавляет\n" +
            "Сама";

    public String secondString = "джава";

    public User() {
    }

    public User(String name) {
        this.name = name;

    }

    public User(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public User(String name, String surname, String email) {
        this.name = name;
        this.surname = surname;
        this.email = email;
    }

    public User(String name, String surname, String email, String password) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.password = password;
    }

    public User(String name, String surname, String email, String password, String sex) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.password = password;
        this.sex = sex;
    }

    public User(String name, String surname, String email, String password, String sex, String country) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.password = password;
        this.sex = sex;
        this.country = country;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return Objects.equals(name, user.name) && Objects.equals(surname, user.surname) && Objects.equals(email, user.email) && Objects.equals(password, user.password) && Objects.equals(sex, user.sex) && Objects.equals(country, user.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, email, password, sex, country);
    }

    public static void printInformation(String name, String surname, String email, String password, String sex, String country) {
        System.out.println("name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", sex='" + sex + '\'' +
                ", country='" + country + '\'');
    }

    public static void read(String stringExample) {
        System.out.println('\'' + "Чатаю " + '\'' + " + " + stringExample);
    }

    public static void write() {
        System.out.println("Напиши в консоли твое имя");
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextLine()) {
            String textWrite = scanner.nextLine();
            System.out.println("Твое имя: " + textWrite);

        } else {
            System.out.println("Wrong Data");
            System.exit(0);
            scanner.close();
        }
    }
}

