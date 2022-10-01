package com.hillelPro.havhun.lesson8.entity;

import java.util.Objects;

public class House {
    private String city;
    private String adress;
    private String owner;
    private String number;

    public House() {
    }

    public House(String city, String adress, String owner, String number) {
        this.city = city;
        this.adress = adress;
        this.owner = owner;
        this.number = number;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof House)) return false;
        House house = (House) o;
        return Objects.equals(city, house.city) &&
                Objects.equals(adress, house.adress) &&
                Objects.equals(owner, house.owner) &&
                Objects.equals(number, house.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(city, adress, owner, number);
    }
}
