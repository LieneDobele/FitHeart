package com.company;


import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        Sportsman person = new Sportsman();

        System.out.println("Welcome to FitHeart application! Please, go to registration:");
        System.out.println();

        System.out.println("Please, enter your name");
        person.setName(input.next());
        System.out.println("Please, enter your age");
        person.setAge(input.nextInt());
        if(person.getAge()<=0){
            System.out.println("Please, enter correct age");
        }
        System.out.println("Please, enter your gender (true for male, false for female)");
        person.checkGender();
        System.out.println("Please, enter your weight");
        person.setWeightKg(input.nextDouble());
        if(person.getWeightKg()<=0){
            System.out.println("Please, enter correct weight");
        }
        System.out.println("Please, enter your height");
        person.setHeightM(input.nextDouble());
        if(person.getHeightM()<=0){
            System.out.println("Please, enter correct height");
        }
        person.calculatingBMI(person.getWeightKg(), person.getHeightM(), person.isMale());

    }

}