package com.geektech;

public class Main {

    public static void main(String[] args) {

        Occupation occupation1 = new Occupation("Architect", "Masters");
        Occupation occupation2 = new Occupation("Businessman", "Bachelors");
        Occupation occupation3 = new Occupation("Lawyer", "Masters");

        Father father = new Father("Father", 55, EyeColor.BLUE, occupation1);
        Son son1 = new Son("John", 33, EyeColor.BROWN, occupation2);
        Son son2 = new Son("Jack", 29, EyeColor.BLUE, occupation3);

        System.out.println(father.getInfo());
        System.out.println("--------------------------");
        System.out.println(son1.getInfo());
        System.out.println("--------------------------");
        System.out.println(son2.getInfo());
        System.out.println("--------------------------");

        father.phycicalAbility(40,"make push-ups");
        father.phycicalAbility("make pull-ups", 30);
        son1.phycicalAbility(50, "jump");
        son1.phycicalAbility("make muscle-ups", 25);
        son2.phycicalAbility(60, "make squats");
        son2.phycicalAbility("make dips", 45);
    }
}
