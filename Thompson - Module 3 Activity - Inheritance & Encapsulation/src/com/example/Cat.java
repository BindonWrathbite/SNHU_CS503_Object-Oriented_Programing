package com.example;

// Created an inheritance relationship with the Animal Class
public class Cat extends Animal{

    // Made attributes private to promote encapsulation and data hiding
    private String specialAbility;
    
    // Constructor
    public Cat(int id, String breed, int age,String specialAbility) {
        super(id, breed, age);
        this.specialAbility = specialAbility;
    }    

    // methods
    public String getSpecialAbility() {
        return specialAbility;
    }

    public void setSpecialAbility(String specialAbility) {
        this.specialAbility = specialAbility;
    }
}
