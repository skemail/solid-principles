package com.cydeo.solid.openClosed.example2.good;

public class Calculator {

    private int num1;
    private int num2;

    public Calculator(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public void calculate(Operation operation){

        operation.calculate(num1, num2);

    }
}
