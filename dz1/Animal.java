package com.batiaev.java2.lesson1.homework;

import lombok.Data;

@Data

public abstract class Animal {
    private String name;
    private int age;
    private long ability;
    private boolean result;

    public Animal(String name, int age, long ability) {
        this.name = name;
        this.age = age;
        this.ability = ability;
        this.result = false;
    }


}
