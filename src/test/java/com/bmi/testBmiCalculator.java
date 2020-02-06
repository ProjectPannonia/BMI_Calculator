package com.bmi;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class testBmiCalculator {
    BmiCalculator firstCalculator = null;
    BmiCalculator secondCalculator = null;
    BmiCalculator thirdCalculator = null;
    BmiCalculator fourthCalculator = null;
    BmiCalculator fifthCalculator = null;
    BmiCalculator sixthCalculator = null;
    String expected;
    String result;

    @Before
    public void init() {
        firstCalculator = new BmiCalculator(180, 90);
        secondCalculator = new BmiCalculator(165, 75);
        thirdCalculator = new BmiCalculator(200, 105);
        fourthCalculator = new BmiCalculator(200, 70);
        fifthCalculator = new BmiCalculator(0, 0);
        sixthCalculator = new BmiCalculator(0, 100);
    }

    @Test
    public void testFirstCalculator() {
        //Height: 180,Weight: 90
        String expectedBmi = "Túlsúlyos.";
        expected = "Your BMI is: " + 27.7 + "\n" + expectedBmi;
        result = firstCalculator.calculate();
        assertEquals(expected, result);
    }

    @Test
    public void testSecondCalculator() {
        //Height: 165,Weight: 75
        String expectedBmi = "Túlsúlyos.";
        expected = "Your BMI is: " + 27.5 + "\n" + expectedBmi;
        result = secondCalculator.calculate();
        assertEquals(expected, result);
    }

    @Test
    public void testThirdCalculator() {
        //Height: 200,Weight:105
        String expectedBmi = "Túlsúlyos.";
        expected = "Your BMI is: " + 26.2 + "\n" + expectedBmi;
        result = thirdCalculator.calculate();
        assertEquals(expected, result);
    }

    @Test
    public void testFourthCalculator() {
        //Height: 200,Weight:70
        String expectedBmi = "Enyhén sovány.";
        expected = "Your BMI is: " + 17.5 + "\n" + expectedBmi;
        result = fourthCalculator.calculate();
        assertEquals(expected, result);
    }

    @Test
    public void testFifthCalculator() {
        //Test with two zero argument
        expected = "Hiba a bevitt adatokban!\n Az adat nem lehet nulla.";
        result = fifthCalculator.calculate();
        assertEquals(expected, result);
    }

    @Test
    public void testSixthCalculator() {
        //Test with zero height
        expected = "Hiba a bevitt adatokban!\n Az adat nem lehet nulla.";
        result = sixthCalculator.calculate();
        assertEquals(expected, result);
    }

    @After
    public void setToNull() {
        firstCalculator = null;
        secondCalculator = null;
        thirdCalculator = null;
        fourthCalculator = null;
        fifthCalculator = null;
        sixthCalculator = null;
    }
}
