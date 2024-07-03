package com.company;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    public void testMultiply() {
        Calculator calculator = new Calculator();
        assertEquals(6, calculator.multiply(2, 3));
    }

    @Test
    public void testMultiply_ByZero() {
        Calculator calculator = new Calculator();
        assertEquals(0, calculator.multiply(2, 0));
    }

    @Test
    public void testDivide() {
        Calculator calculator = new Calculator();
        assertEquals(2, calculator.divide(6, 3));
    }

    @Test
    public void testDivide_ByZero() {
        Calculator calculator = new Calculator();
        assertThrows(IllegalArgumentException.class, () -> {
            calculator.divide(1, 0);
        });
    }

    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        assertEquals(5, calculator.add(2, 3));
    }

    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator();
        assertEquals(-1, calculator.subtract(2, 3));
    }

    @Test
    public void testAdd_NegativeNumbers() {
        Calculator calculator = new Calculator();
        assertEquals(-5, calculator.add(-2, -3));
    }

    @Test
    public void testSubtract_NegativeNumbers() {
        Calculator calculator = new Calculator();
        assertEquals(1, calculator.subtract(-2, -3));
    }
}
