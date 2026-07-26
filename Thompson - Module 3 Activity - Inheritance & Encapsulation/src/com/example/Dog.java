package com.example;

// Created an inheritance relationship with the Animal Class.
public class Dog extends Animal{

    // Made attributes private to promote encapsulation and data hiding
    private String specialAbility;

    // Constructor
    public Dog(int id, String breed, int age,String specialAbility) {
        super(id, breed, age);
        this.specialAbility = specialAbility;
    }    

    // Methods
    public String getSpecialAbility() {
        return specialAbility;
    }

    public void setSpecialAbility(String specialAbility) {
        this.specialAbility = specialAbility;
    }   
    
}
