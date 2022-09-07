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

    public User(String name, String surname, String email, String password, String sex, String country) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.password = password;
        this.sex = sex;
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

    public static void print(String name, String surname, String email, String password, String sex, String country) {
        System.out.println("name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", sex='" + sex + '\'' +
                ", country='" + country + '\'');
    }

    public static void read(String str) {
        System.out.println("Сообщение принято " + str);

    }

    public static void write() {
        System.out.println("Введите текст");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ваш текст: " + scanner);
        scanner.close();
    }
}
