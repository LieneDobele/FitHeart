package com.company;

import java.util.Scanner;

public class Sportsman {


    private static Scanner input = new Scanner(System.in);


    private int age = input.nextInt();
    private boolean isMale = input.nextBoolean();
    private double weightKg = input.nextDouble();
    private double heightM = input.nextDouble();
    private double bmi = input.nextDouble();


    public static double calculatingBMI(double weightKg, double heightM, boolean isMale) {
        double BMI = weightKg / (heightM * heightM);

        System.out.println("Your body mass index (BMI) is " + BMI + " .");
        if (isMale) {
            evaluateBmiMan(BMI);
        }
        else {
            evaluateBmiWoman(BMI);
        }
        return BMI;
        }


    public static void evaluateBmiMan (double bmi) {
            if (bmi < 18.5) {
                System.out.println("You are underweight.");
            } else if (bmi > 18.5 && bmi < 24.9) {
                System.out.println("You have healthy weight.");
            } else if (bmi > 25.0 && bmi < 29.9) {
                System.out.println("You are overweight.");
            } else {
                System.out.println("You are obese.");
            }
        }


    public static void evaluateBmiWoman (double bmi) {

            if (bmi < 19) {
                System.out.println("You are underweight.");
            } else if (bmi > 19 && bmi < 25.2) {
                System.out.println("You have healthy weight.");
            } else if (bmi > 25.3 && bmi < 30.1) {
                System.out.println("You are overweight.");
            } else {
                System.out.println("You are obese.");

            }
        }
    }








