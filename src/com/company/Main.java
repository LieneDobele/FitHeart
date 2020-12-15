package com.company;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);


        System.out.println("Please, enter your name");
        String name = input.next();
        System.out.println("Please, enter your age");
        int age = input.nextInt();
        System.out.println("Please, enter your gender");
        boolean isMale = input.nextBoolean();
        System.out.println("Please, enter your weight");
        double weightKg = input.nextDouble();
        System.out.println("Please, enter your height");
        double heightM = input.nextDouble();






    }

}