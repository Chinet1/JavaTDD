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
}
