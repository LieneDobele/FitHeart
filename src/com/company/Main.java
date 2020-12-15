package com.company;


import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        Sportsman person = new Sportsman();
        Sportsman person1 = new Sportsman();



        System.out.println("Please, enter your name");
        person.setName(input.next());
        System.out.println("Please, enter your age");
        person.setAge(input.nextInt());
        System.out.println("Please, enter your gender");
        boolean isMale = input.nextBoolean();
        System.out.println("Please, enter your weight");
        double weightKg = input.nextDouble();
        System.out.println("Please, enter your height");
        double heightM = input.nextDouble();
        person.calculatingBMI(person.getWeightKg(), person.getHeightM(), true);

    }

}