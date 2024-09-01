package com.coditory.sandbox;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorSpec {
    @Test
    public void shouldSubtractTwoNumbers() {
        assertEquals(1, Calculator.subtract(3, 2));
    }
}
