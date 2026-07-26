package com.example;

public abstract class Animal {    

    // Made attributes private to promote encapsulation and data hiding
    private int id;
    private String breed;
    private int age;
    
    //Constructor
     public Animal(int id, String breed, int age) {
        this.id = id;
        this.breed = breed;
        this.age = age;
    }
    
    //methods
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }    
    
}
