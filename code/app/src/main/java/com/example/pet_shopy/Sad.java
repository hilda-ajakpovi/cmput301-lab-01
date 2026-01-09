package com.example.pet_shopy;

import java.util.Date;

public class Sad extends Mood {
    public Sad() {
        super();
    }

    public Sad(Date date) {
        super(date);
    }

    @Override
    public String representaion() {
        return "Sad";
    }
}
