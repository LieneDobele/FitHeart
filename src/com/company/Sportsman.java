package com.company;

import java.util.Scanner;

public class Sportsman {

    Scanner input = new Scanner(System.in);

    private String name;
    private int age;
    private boolean isMale;
    private double weightKg;
    private double heightM;
    private double bmi;

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

    public void checkGender (String gender){
        System.out.println("Please, enter your gender (male or female)");
        gender = input.nextLine();
        if (gender.equalsIgnoreCase("male")){
    public void checkGender() {
        String gender = input.nextLine();
        if (gender.equalsIgnoreCase("male")) {
            isMale = true;
        } else if (gender.equalsIgnoreCase("female")) {
            isMale = false;
        } else {
            System.out.println("Enter correct gender");
        }
    }

    public void registration(){
        System.out.println("Welcome to FitHeart application! Please, go to registration:");
        System.out.println();
        System.out.println("Please, enter your name");
        name = input.next();

        System.out.println("Please, enter your age");
        age = input.nextInt();
        if (age<=14){
            System.out.println("Please, enter correct age");
        }
       checkGender(input.nextLine());

        System.out.println("Please, enter your weight");
        weightKg = input.nextDouble();
        if (weightKg<=0){
            System.out.println("Please, enter correct weight");
        }
        System.out.println("Please, enter your height");
        heightM = input.nextDouble();
        if (weightKg<=0){
            System.out.println("Please, enter correct height");
        }
        System.out.println(name + " ,thank you for registration! Welcome to FitHeart!");
    }

    public double calculatingBMI(double weightKg, double heightM, boolean isMale) {
        double bmi = weightKg / (heightM * heightM);

        System.out.println("Your body mass index (BMI) is " + bmi + " .");

        System.out.println("Your body mass index (BMI) is " + bmi + " .");
        if (isMale) {
            evaluateBmiMan(bmi);
        } else {
            evaluateBmiWoman(bmi);
        }
        return bmi;
    }


    public void evaluateBmiMan(double bmi) {
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

    public void evaluateBmiWoman(double bmi) {

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

    double waterIntakeMan = weightKg / 28; //it calculates, how much water need to drink for method advices
    double waterIntakeWoman = weightKg/ 30; //maybe will need to add class from where it comes

    public void advices(double bmi, int age) {
    public void advices (double bmi, int age) {
    age = getAge();
    bmi = getBmi();
        if (isMale) {
            if (age > 20 && bmi > 18.5 && bmi < 24.9) {
                System.out.println("For you it’s ideal to sleep 8 hours, " +
                        "walk 10 000 steps, be outside for a 2 hours.");
            } else if (age > 40 && bmi > 18.5 && bmi < 24.9) {
                System.out.println("For you it’s ideal to sleep 7 hours," +
                        " walk 9 000 steps, be outside for a 1,5 hours.");
            } else if (age > 50 && bmi > 18.5 && bmi < 24.9) {
                System.out.println("For you it’s ideal to sleep 8 hours, " +
                        "walk 12 000 steps, be outside for an 3 hours.");
            }
        } else if (!isMale) {
            if (age > 20 && bmi > 19 && bmi < 25.2) {
                System.out.println("For you it’s ideal to sleep 8 hours, " +
                        "walk 10 000 steps, be outside for a 2 hours.");
            } else if (age > 40 && bmi > 19 && bmi < 25.2) {
                System.out.println("For you it’s ideal to sleep 7 hours," +
                        " walk 9 000 steps, be outside for a 1,5 hours.");
            } else if (age > 50 && bmi > 19 && bmi < 25.2) {
                System.out.println("For you it’s ideal to sleep 8 hours, " +
                        "walk 12 000 steps, be outside for an 3 hours.");
            }
        }

        if (bmi > 25) {
            System.out.println("Follow a healthy diet, avoid sugar and refined carbohydrates. Don`t eat after 6PM.");
            System.out.println(); //empty line
            System.out.println("We have prepared a healthy eating plan for you. If you would like to see it, please enter 1.");
            //te vajag user input - un
            //
            // switch no Lienes!
            //kas būs, ja ievadīs 2? - nekas?

        } else if (bmi > 19 && bmi < 25) {
            System.out.println("Follow a healthy diet.");

        }
        //if you would like to have - we have prepared healthy eating plan for you. Please - enter 1, if you want to see it.


        if (isMale) {
            System.out.println("You should drink 15 cups of water per day");
        }
        else if (!isMale){
            System.out.println("You should drink 11 cups of water per day");
            System.out.println("You should drink " + waterIntakeMan +  " liters of water per day.");
        } else if (!isMale) {
            System.out.println("You should drink " + waterIntakeWoman + " liters of water per day.");

        }
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

    public double getBmi() {
        return bmi;
    }
}
