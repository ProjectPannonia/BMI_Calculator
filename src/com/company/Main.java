package com.company;

public class Main {

    public static void main(String[] args) {
	BmiCalculator bmi = new BmiCalculator(180,90);
        System.out.println(bmi.calculate());
    }
}
