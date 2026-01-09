package com.example.pet_shopy;

import java.util.Date;

public class Scorpion extends Pet{
    /*This sub class inherits all methods and parameters from super class*/

    public Scorpion(String name) {
        super(name); // Calls super class constructor
    }

    public Scorpion(String name, Date birthDate) {
        super(name, birthDate);
    }

    @Override // function decorater - nice way to denote that you are overiding the declartion from super class
    public String speak() {
        return "Hiss";
    }

}
