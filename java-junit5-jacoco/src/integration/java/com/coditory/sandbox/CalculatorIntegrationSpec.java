package com.coditory.sandbox;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorIntegrationSpec {
    @Test
    public void shouldAddTwoNumbers() {
        assertEquals(5, Calculator.add(2, 3));
    }

    @Test
    public void shouldMultiplyTwoNumbers() {
        assertEquals(6, Calculator.multiply(2, 3));
    }
}
