package com.bmi;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class testBmiCalculator {
    BmiCalculator calculator = null;

    @Before
    public void init(){
        calculator = new BmiCalculator(180,90);
    }
    @Test
    public void testCalculator(){
        String expectedBmi = "Túlsúlyos.";
        String expectedString = "Your BMI is: " + 27.7 + "\n" + expectedBmi;
        String result = calculator.calculate();
        assertEquals(expectedString,result);
    }
    @After
    public void setToNull(){
        calculator = null;
    }
}
