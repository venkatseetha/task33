package com.company;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    public void testMultiply() {
        Calculator calculator = new Calculator();
        // Positive numbers
        assertEquals(6, calculator.multiply(2, 3));
        // Zero cases
        assertEquals(0, calculator.multiply(0, 3));
        assertEquals(0, calculator.multiply(2, 0));
        // Negative numbers
        assertEquals(-6, calculator.multiply(-2, 3));
        assertEquals(-6, calculator.multiply(2, -3));
        assertEquals(6, calculator.multiply(-2, -3));
    }

    @Test
    public void testDivide() {
        Calculator calculator = new Calculator();
        // Positive numbers
        assertEquals(2, calculator.divide(6, 3));
        // Negative numbers
        assertEquals(-2, calculator.divide(-6, 3));
        assertEquals(-2, calculator.divide(6, -3));
        assertEquals(2, calculator.divide(-6, -3));
        // Division by one
        assertEquals(6, calculator.divide(6, 1));
        assertEquals(-6, calculator.divide(-6, 1));
    }

    @Test
    public void testDivideByZero() {
        Calculator calculator = new Calculator();
        // Division by zero should throw IllegalArgumentException
        assertThrows(IllegalArgumentException.class, () -> {
            calculator.divide(1, 0);
        });
    }

    @Test
    public void testAddition() {
        Calculator calculator = new Calculator();
        // Positive numbers
        assertEquals(5, calculator.add(2, 3));
        // Zero cases
        assertEquals(3, calculator.add(0, 3));
        assertEquals(2, calculator.add(2, 0));
        // Negative numbers
        assertEquals(1, calculator.add(-2, 3));
        assertEquals(-1, calculator.add(2, -3));
        assertEquals(-5, calculator.add(-2, -3));
    }

    @Test
    public void testSubtraction() {
        Calculator calculator = new Calculator();
        // Positive numbers
        assertEquals(1, calculator.subtract(3, 2));
        // Zero cases
        assertEquals(3, calculator.subtract(3, 0));
        assertEquals(-2, calculator.subtract(0, 2));
        // Negative numbers
        assertEquals(-5, calculator.subtract(-2, 3));
        assertEquals(5, calculator.subtract(2, -3));
        assertEquals(1, calculator.subtract(-2, -3));
    }
}
