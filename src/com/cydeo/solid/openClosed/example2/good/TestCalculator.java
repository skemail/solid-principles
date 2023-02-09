package com.cydeo.solid.openClosed.example2.good;

public class TestCalculator {

    public static void main(String[] args) {

        Calculator c1 = new Calculator(5,6);

        c1.calculate(new Addition());
        c1.calculate(new Modulus());

    }
}
