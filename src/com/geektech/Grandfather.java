package com.geektech;

public class Grandfather {

    // класс 1-го уровня
    private String name;
    private int age;
    private EyeColor eyeColor;
    private Occupation occupation;

    public Grandfather(String name, int age, EyeColor eyeColor, Occupation occupation) {
        this.name = name;
        this.age = age;
        this.eyeColor = eyeColor;
        this.occupation = occupation;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public EyeColor getEyeColor() {
        return eyeColor;
    }

    public Occupation getOccupation() {
        return occupation;
    }
}
