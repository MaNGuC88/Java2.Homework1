package com.geektech;

public class Father extends Grandfather {

    // класс 2-го уровня
    public Father(String name, int age, EyeColor eyeColor, Occupation occupation) {
        super(name, age, eyeColor, occupation);
    }

    // перегрузка методов
    public void physicalAbility(int number, String exercise) {
        System.out.println(getName() + " can " + exercise + " " + number + " times");
    }

    // неперезаписываемый метод
    public final void physicalAbility(String exercise, int number) {
        System.out.println(getName() + " can " + exercise + " " + number + " times");
    }

    public String getInfo() {
        return "Name: " + getName() + "\nAge: " + getAge() + "\nEye Color: " + getEyeColor()
                + "\nJob: " + getOccupation().getJob() + "\nEducation: " + getOccupation().getEducation();
    }
}
