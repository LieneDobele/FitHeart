package com.company;

public class Main {

    public static void main(String[] args) {

        Sportsman person = new Sportsman();
        person.registration();
        person.calculatingBMI(person.getWeightKg(), person.getHeightM(), person.isMale());
        person.advices(person.getBmi(), person.getAge());
    }
}