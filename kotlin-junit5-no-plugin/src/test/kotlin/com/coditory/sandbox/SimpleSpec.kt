package com.coditory.sandbox

import InternalObject
import PublicObject
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SimpleSpec {
    @Test
    fun shouldSumTwoNumbers() {
        assertEquals(4, 2 + 2)
    }

    @Test
    fun shouldSeePublicObjectOnClasspath() {
        assertEquals("Public", PublicObject.SOME_VALUE)
    }

    @Test
    fun shouldSeeInternalObjectOnClasspath() {
        assertEquals("Internal", InternalObject.SOME_VALUE)
    }
}
