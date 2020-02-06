package com.bmi;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class testBmiCalculator {
    BmiCalculator firstCalculator = null;
    BmiCalculator secondCalculator = null;
    BmiCalculator thirdCalculator = null;

    @Before
    public void init(){
        firstCalculator = new BmiCalculator(180,90);
        secondCalculator = new BmiCalculator(165,75);
        thirdCalculator = new BmiCalculator(200,105);
    }
    @Test
    public void testFirstCalculator(){
        //Height: 180,Weight: 90
        String expectedBmi = "Túlsúlyos.";
        String expectedString = "Your BMI is: " + 27.7 + "\n" + expectedBmi;
        String result = firstCalculator.calculate();
        assertEquals(expectedString,result);
    }
    @Test
    public void testSecondCalculator(){
        //Height: 165,Weight: 75
        String expectedBmi = "Túlsúlyos.";
        String expectedString = "Your BMI is: " + 27.5 + "\n" + expectedBmi;
        String result = secondCalculator.calculate();
        assertEquals(expectedString,result);
    }
    @Test
    public void testThirdCalculator(){
        //Height: 200,Weight:105
        String expectedBmi = "Túlsúlyos.";
        String expectedString = "Your BMI is: " + 26.2 + "\n" + expectedBmi;
        String result = thirdCalculator.calculate();
        assertEquals(expectedString,result);
    }
    @After
    public void setToNull(){
        firstCalculator = null;
    }
}
