package com.bmi;

public class BmiCalculator {
    private double height;
    private double weight;

    public BmiCalculator(double height, double weight) {
        this.height = height;
        this.weight = weight;
    }

    protected String calculate() {
        String result = giveTheResult(height, weight);
        return result;
    }

    private String giveTheResult(double height, double weight) {
        String result;
        boolean isNotZero = isValidArguments(height, weight);

        if (!isNotZero) {
            result = "Hiba a bevitt adatokban!\n Az adat nem lehet nulla.";
        } else {
            double weightPerThousand = height / 100;
            double bmi = weight / (weightPerThousand * weightPerThousand);
            String bmiText = String.valueOf(bmi).substring(0, 4);
            result = "Your BMI is: " + bmiText + "\n" + result(bmi);
        }
        return result;
    }

    private boolean isValidArguments(double height, double weight) {
        //Return true - not null arguments
        boolean isNotZero = height > 0 && weight > 0;
        return isNotZero;
    }

    private String result(double bmi) {
        String result;
        if (bmi < 16.0) {
            result = "Súlyosan sovány.";
        } else if (bmi >= 16.0 && bmi <= 17.0) {
            result = "Közepesen sovány.";
        } else if (bmi > 17.0 && bmi <= 18.5) {
            result = "Enyhén sovány.";
        } else if (bmi > 18.5 && bmi <= 25.0) {
            result = "Egészséges";
        } else if (bmi > 25.0 && bmi <= 30) {
            result = "Túlsúlyos.";
        } else if (bmi > 30 && bmi <= 35.0) {
            result = "Enyhén elhízott.";
        } else if (bmi > 35.0 && bmi <= 40.0) {
            result = "Közepesen elhízott.";
        } else {
            result = "Súlyosan elhízott.";
        }
        return result;
    }
}
