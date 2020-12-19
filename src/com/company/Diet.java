package com.company;

import java.util.Scanner;

public class Diet {public static void healthyDiet () {
    Scanner input = new Scanner(System.in);

    System.out.println("We can help you plan your healthy diet. If you would like to see our plan, please, type yes." +
            "Otherwise - please, type no.");
    String text = input.nextLine();

    if (text.equalsIgnoreCase("no")) {
        System.out.println("Thank you for checking FitHeart application. We hope to see you again!");
    } else if (text.equalsIgnoreCase("yes")) {
        printInstructions();
        boolean quit = false;
        while (!quit) {

            int choice = input.nextInt();

            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    System.out.println("Breakfast: Option 1: Two Scrambled eggs, unlimited green vegetables and avocado (cauliflower, capsicum and mushrooms are low calories so also allowed.)");
                    System.out.println("Option 2: Two boiled or baked eggs, unlimited green vegetables, avocado and a slice of bacon.");
                    break;
                case 2:
                    System.out.println("Lunch. Option 1: 2-3 cups of mixed vegetables with grilled salmon or chicken.");
                    System.out.println("Option 2: Big bowl of crunchy green salad with lots of leafy green, olive oil dressing and feta cheese.");
                    break;
                case 3:
                    System.out.println("Dinner. Option 1: Grilled fish or chicken with cooked vegetables and green salad.");
                    System.out.println("Option 2: Grilled steak with cauliflower rice and sauted bell pepper and mushrooms.");
                    break;
                case 4:
                    System.out.println("Avoid sugar, grains, refined carbs and dairy. Don`t eat after 6 PM!");
                    break;
                case 5:
                    System.out.println("Don`t forget to drink plenty of water and follow your regime.");
                    System.out.println("The only way to see results is if you stay consistent!");
                    break;
                case 6:
                    System.out.println("Your body can dot it, it`s time to convince your mind!");
                    quit = true;
                    break;
            }
        }
    }
}

    private static void printInstructions() {
        System.out.println("\nPress ");
        System.out.println("\t 0 - To print choices.");
        System.out.println("\t 1 - To see examples of breakfast menu.");
        System.out.println("\t 2 - To see examples of lunch menu.");
        System.out.println("\t 3 - To see examples of dinner menu.");
        System.out.println("\t 4 - What to avoid.");
        System.out.println("\t 5 - Don`t forget!");
        System.out.println("\t 6 - To quit the diet suggestions.");
    }
}






