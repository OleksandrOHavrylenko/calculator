package com.leszko.calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private Calculator calculator = new Calculator();

    @Test
    void testSum() {
        assertEquals(5, calculator.sum(2, 3));
    }
}