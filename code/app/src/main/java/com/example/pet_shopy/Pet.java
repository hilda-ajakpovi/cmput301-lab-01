package com.example.pet_shopy;
import java.util.Date;

public abstract class Pet {
    /*Abstract classes cannot be created directly but can be used as a super or Parent class*/
    private String name;
    private Date birthDate;

    public Pet(String name) {
       this.name = name;
       this.birthDate = new Date();
    }

    public Pet(String name, Date birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public abstract String speak(); // defines that the function exits so that the children can implement their own version
}
