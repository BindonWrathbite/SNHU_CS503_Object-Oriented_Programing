package com.example;

public class Main {
   
    public static void main(String[] args) {

        /* Instantiated myDog and myCat as a Dog and Cat objects with fields:
                id, breed, age, and specialAbility
        */
        Animal myDog = new Dog(1, "Labrador", 3, "Playing Dead");
        Animal myCat = new Cat(2, "Siamese", 2, "Climbing Trees");

        /* Output to terminal if myDog & myCat are instances of Animal to validate inheritance relationship
        Note: IDE may target "(myDog/myCat) instanceof Animal" as "condition always true" */
        System.out.println("Testing Inheritance Relationship");
        System.out.println("\tmyDog is an instance of the Animal class (True/False): " + (myDog instanceof Animal));
        System.out.println("\tmyCat is an instance of the Animal class (True/False): " + (myCat instanceof Animal));

        // Testing data retrieval of the Dog object with print statements
        System.out.println("\nTesting Data Retrieval of Dog Object");
        System.out.println("\tDog ID: " + myDog.getId());
        System.out.println("\tDog Breed: " + myDog.getBreed());
        System.out.println("\tDog Age: " + myDog.getAge());

        // Testing data retrieval of the Cat object with print statements
        System.out.println("\nTesting Data Retrieval of Cat Object");
        System.out.println("\tCat ID: " + myCat.getId());
        System.out.println("\tCat Breed: " + myCat.getBreed());
        System.out.println("\tCat Age: " + myCat.getAge());

    }
    
}
