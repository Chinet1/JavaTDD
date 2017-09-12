package com.mateuszzbylut.calculator;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CalculatorTest {

    private static Calculator calculator;

    @BeforeClass
    public static void init(){
        calculator = new Calculator();
    }

    @Test
    public void WhenCalculatorInitializedThenReturnTrue() {
        assertTrue(calculator.getStatus());
    }

    @Test
    public void WhenAdditionTwoNumberThenReturnCorrectAnswer() {
        assertEquals( 5, calculator.addition(2,3));
    }
}
