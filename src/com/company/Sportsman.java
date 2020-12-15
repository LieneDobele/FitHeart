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
}
