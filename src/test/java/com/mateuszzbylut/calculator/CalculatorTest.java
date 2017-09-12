package com.mateuszzbylut.calculator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CalculatorTest {

    @Test
    public void WhenCalculatorInitializedThenReturnTrue() {
        Calculator calculator = new Calculator();

        assertTrue(calculator.getStatus());
    }

    @Test
    public void WhenAdditionTwoNumberThenReturnCorrectAnswer() {
        Calculator calculator = new Calculator();

        assertEquals( 5, calculator.addition(2,3));
    }
}
