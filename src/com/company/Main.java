package com.company;

public class Main {

    public static void main(String[] args) {

        Sportsman person = new Sportsman();
        person.registration();
        Calculation.calculatingBMI(person.getWeightKg(), (int) person.getHeightM(), person.isMale());
        Advices.advices(person.getBmi(), person.getAge(), person.getWeightKg());
        Advices.advicesWater(person.getWeightKg(), person.isMale());
        Diet.healthyDiet();

    }
}