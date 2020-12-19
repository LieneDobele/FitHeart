package com.company;

import java.text.DecimalFormat;

public class Calculation {
    public static double calculatingBMI(double weightKg, int heightCm, boolean isMale) {
        double heightM = heightCm * 0.01;
        double bmi = weightKg / (heightM * heightM); //jāpieliek uz cm
        DecimalFormat df = new DecimalFormat("#.##");

        System.out.println("Your body mass index (BMI) is " + df.format(bmi) + ".");
        if (isMale) {
            evaluateBmiMan(bmi);
        } else {
            evaluateBmiWoman(bmi);
        }
        return bmi;
    }


    public static void evaluateBmiMan(double bmi) {
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

    public static void evaluateBmiWoman(double bmi) {

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
