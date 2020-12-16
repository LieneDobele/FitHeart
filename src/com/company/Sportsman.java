package com.company;

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

    public Sportsman() {
    }

    public static double calculatingBMI(double weightKg, double heightM, boolean isMale) {
        double BMI = weightKg / (heightM * heightM);

        System.out.println("Your body mass index (BMI) is " + BMI + " .");
        if (isMale) {
            evaluateBmiMan(BMI);
        } else {
            evaluateBmiWoman(BMI);
        }
        return BMI;
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

    public void advices (double bmi, int age) {
        if (isMale) {
            if (age > 20 && bmi > 18.5 && bmi < 24.9) {
                System.out.println("For you it’s ideal to sleep 8 hours, " +
                        "walk 10 000 steps, be outside for 2 hours.");
            } else if (age > 40 && bmi > 18.5 && bmi < 24.9) {
                System.out.println("For you it’s ideal to sleep 7 hours," +
                        " walk 9 000 steps, be outside for 1,5 hours.");
            } else if (age > 50 && bmi > 18.5 && bmi < 24.9) {
                System.out.println("For you it’s ideal to sleep 8 hours, " +
                        "walk 12 000 steps, be outside for 3 hours.");
            }
        } else if (!isMale) {
            if (age > 20 && bmi > 19 && bmi < 25.2) {
                System.out.println("For you it’s ideal to sleep 8 hours, " +
                        "walk 10 000 steps, be outside for 2 hours.");
            } else if (age > 40 && bmi > 19 && bmi < 25.2) {
                System.out.println("For you it’s ideal to sleep 7 hours," +
                        " walk 9 000 steps, be outside for 1,5 hours.");
            } else if (age > 50 && bmi > 19 && bmi < 25.2) {
                System.out.println("For you it’s ideal to sleep 8 hours, " +
                        "walk 12 000 steps, be outside for 3 hours.");
            }
        }

        if (bmi > 25){
            System.out.println("Follow a healthy diet, avoid sugar and refined carbohydrates. Don`t eat after 6PM.");
        }
        else if (bmi > 19 && bmi < 25){
            System.out.println("Follow a healthy diet.");

        }
        if (isMale) {
            System.out.println("You should drink 15 cups of water per day");
        }
        else if (!isMale){
            System.out.println("You should drink 11 cups pf water per day");

        }

       }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isMale() {
        return isMale;
    }

    public void setMale(boolean male) {
        isMale = male;
    }

    public double getWeightKg() {
        return weightKg;
    }

    public void setWeightKg(double weightKg) {
        this.weightKg = weightKg;
    }

    public double getHeightM() {
        return heightM;
    }

    public void setHeightM(double heightM) {
        this.heightM = heightM;
    }

}
