package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        int result1 = calculator.add(5,10);
        int result2 = calculator.subtract(5,10);

        if (result1 == 15) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }
        if (result2 == -5) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }
    }
}
