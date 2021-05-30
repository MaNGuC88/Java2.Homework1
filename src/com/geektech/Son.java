package com.geektech;

public final class Son extends Father {

    // класс 3-го уровня
    public Son(String name, int age, EyeColor eyeColor, Occupation occupation) {
        super(name, age, eyeColor, occupation);
    }

    // перезапись метода родителя
    @Override
    public void phycicalAbility(int number, String exercise) {
        System.out.println(getName() + " can " + exercise + " " + number + " times" +
                " and also sings very well");
    }
}
