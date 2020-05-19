package com.coditory.sandbox

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.assertEquals

class SimpleIntegrationSpec {
    @Test
    fun shouldSumTwoNumbers() {
        assertEquals(4, 2 + 2)
    }
}