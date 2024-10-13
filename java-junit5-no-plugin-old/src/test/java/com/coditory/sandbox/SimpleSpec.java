package com.coditory.sandbox;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimpleSpec {
    @Test
    public void shouldSumTwoNumbers() {
        assertEquals(4, 2 + 2);
    }
}
