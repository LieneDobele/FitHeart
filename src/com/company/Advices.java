package com.company;

import java.text.DecimalFormat;

public class Advices {

    public static void advices (double bmi, int age, double weightKg) {
        if (age >= 20 && bmi > 18.5 && bmi < 29.9) { //I deleted male and woman differences because they're almost the same
            System.out.println("For you it’s ideal to sleep 8 hours, " +
                    "walk 10 000 steps, be outside for a 2 hours.");
        } else if (age >= 40 && bmi > 18.5 && bmi < 29.9) {
            System.out.println("For you it’s ideal to sleep 7 hours," +
                    " walk 9 000 steps, be outside for a 1,5 hours.");
        } else if (age >= 50 && bmi > 18.5 && bmi < 29.9) {
            System.out.println("For you it’s ideal to sleep 8 hours, " +
                    "walk 8 000 steps, be outside for an 3 hours.");
        }
    }

    public static void advicesWater(double weightKg, boolean isMale) {
        weightKg = weightKg;
        isMale = isMale;
        double waterIntakeMan = weightKg / 28;
        double waterIntakeWoman = weightKg / 30;
        DecimalFormat df1 = new DecimalFormat("#.##");

        if (isMale) {
            System.out.println("You should drink " + df1.format(waterIntakeMan) + " liters of water per day.");
        } else {
            System.out.println("You should drink " + df1.format(waterIntakeWoman) + " liters of water per day.");
        }
        System.out.println("Follow a healthy diet, avoid sugar and refined carbohydrates.");
    }
}
