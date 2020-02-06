package com.bmi;

public class Main {
    public static void main(String[] args) {
        BmiCalculator bmi = new BmiCalculator(200,105);
        System.out.println(bmi.calculate());
    }
}
