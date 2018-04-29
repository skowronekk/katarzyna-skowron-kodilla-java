package com.kodilla;

import java.lang.*;

public class Calculator
{
    public int addMethod(int a, int b) {
        return a + b;
    }

    public int substractMethod(int a, int b) {
        return a - b;
    }
}

class Application
{
    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        int result = calculator.addMethod(5, 5);

        System.out.println(result);

    }
}