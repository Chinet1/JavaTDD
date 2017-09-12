package com.mateuszzbylut.calculator;

public class Calculator {

    private boolean status;

    public Calculator() {
        this.status = true;
    }

    public boolean getStatus() {
        return status;
    }

    public int addition(int a, int b) {
        return a + b;
    }

    public int subtraction(int a, int b) {
        return a - b;
    }

    public int division(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot division by zero");
        } else {
            return a / b;
        }
    }
}
