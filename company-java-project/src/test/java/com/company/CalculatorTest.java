package com.company;

public class Calculator {

    // Example of a duplicated method
    public int multiply(int a, int b) {
        return a * b;
    }

    // Example of a duplicated method
    public int multiplyAgain(int a, int b) {
        return a * b;
    }

    // Complex method without proper documentation
    public int complexMethod(int a, int b) {
        int result = 0;
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                result += i * j;
            }
        }
        return result;
    }

    public int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return a / b;
    }

    // Method with no usage
    public int unusedMethod(int a, int b) {
        return a + b;
    }

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }
}
