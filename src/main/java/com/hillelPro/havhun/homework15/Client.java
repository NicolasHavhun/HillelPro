package com.hillelPro.havhun.homework15;

public class Client  {
    private String login;
    private int age;
    private Gender gender;

    public Client(String login, int age, Gender gender) {
        this.login = login;
        this.age = age;
        this.gender = gender;
    }

    public Client(Client login) {

    }


    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Client{" +
                "login='" + login + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }

   public boolean goToTheArmy(Client s) {
        return s.getAge() >= 18 && s.getAge() < 27 && s.getGender() == Gender.Man;
    }



}


