package com.mateuszzbylut.calculator;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CalculatorTest {

    private static Calculator calculator;

    @BeforeAll
    public static void init(){
        calculator = new Calculator();
    }

    @Test
    public void whenCalculatorInitializedThenReturnTrue() {
        assertTrue(calculator.getStatus());
    }

    @Test
    public void whenAdditionTwoNumberThenReturnCorrectAnswer() {
        assertEquals( 5, calculator.addition(2,3));
    }

    @Test
    public void whenSubtractionThenReturnCorrectAnswer() {
        assertEquals( 3, calculator.subtraction(7, 4));
    }

    @Test
    public void whenDivisionThenReturnCorrectAnswer() {
        assertEquals(2, calculator.division(8, 4));
    }

    @Test
    public void whenDivisionByZeroThenThrowException() {
        Throwable exception = assertThrows(IllegalArgumentException.class, () -> {
            calculator.division(5, 0);
        });
        assertEquals("Cannot division by zero", exception.getMessage());
    }
}
