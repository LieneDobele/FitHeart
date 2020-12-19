package com.company;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Sportsman {

    Scanner input = new Scanner(System.in);

    private String name;
    private int age;
    private boolean isMale;
    private double weightKg;
    private double heightM;
    private double bmi;

    public Sportsman() {
    }
    public void registration(){
        System.out.println("Welcome to FitHeart application! Please, go to registration:");
        System.out.println();
        System.out.println("Please, enter your name");
        while (input.hasNext()) {

            name = input.next();
            checkGender(input.nextLine());
            checkAge();
            checkWeight();
            checkHeight();
            System.out.println(name + " ,thank you for registration! Welcome to FitHeart!");
            break;
        }
    }

    public void checkGender (String gender){
        System.out.println("Please, enter your gender (male or female)");
        gender = input.nextLine();
        if (gender.equalsIgnoreCase("male")){
            isMale = true;
        }
        else if (gender.equalsIgnoreCase("female")){
            isMale = false;
        }
        else {
            System.out.println("Enter correct gender");
        }
    }

    public void checkAge (){
        System.out.println("Please, enter your age");
        age = input.nextInt();
        while (age <= 14 || age>100) {
            System.out.println("Please, enter correct age");
            age = input.nextInt();
            break;
        }
    }
    public void checkWeight (){
        System.out.println("Please, enter your weight in kg");
        weightKg = input.nextDouble();
        while (weightKg <= 30 || weightKg>300) {
            System.out.println("Please, enter correct weight");
            weightKg = input.nextDouble();
            break;
        }
    }

    public void checkHeight (){
        System.out.println("Please, enter your height in cm");
        heightM = input.nextDouble();
        while (heightM <= 100 || heightM>220) {
            System.out.println("Please, enter correct height");
            break;
        }
    }
        public int getAge() {
        return age;
    }

    public boolean isMale() {
        return isMale;
    }

    public double getWeightKg() {
        return weightKg;
    }

    public double getHeightM() {
        return heightM;
    }
    public double getBmi() {
        return bmi;
    }

}
