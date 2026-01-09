package com.example.pet_shopy;

import java.util.Date;

public class Cat extends Pet implements Pettable{
    /*This sub class inherits all methods and parameters from super class*/

    public Cat(String name) {
        super(name); // Calls super class constructor
    }

    public Cat(String name, Date birthDate) {
        super(name, birthDate);
    }

    @Override // function decorater - nice way to denote that you are overiding the declartion from super class
    public String speak() {
        return "Meow";
    }

    @Override
    public void pet() {

    }
}
