package com.company;

import java.util.Scanner;

public class Sportsman {

    private String name;
    private int age;
    private boolean isMale;
    private double weightKg;
    private double heightM;
    private double bmi;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;

    }

    public Sportsman(String name, int age, double weightKg, double heightM) {
        this.name = name;
        this.age = age;
        this.weightKg = weightKg;
        this.heightM = heightM;

    }

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
