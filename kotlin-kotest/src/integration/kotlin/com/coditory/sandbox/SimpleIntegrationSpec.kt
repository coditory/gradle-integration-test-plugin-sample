package com.coditory.sandbox

import InternalObject
import PublicObject
import io.kotest.core.spec.style.FreeSpec
import org.junit.jupiter.api.Assertions.assertEquals

class SimpleIntegrationSpec : FreeSpec({
    "should sum two numbers" {
        assertEquals(4, 2 + 2)
    }

    "should see public object on classpath" {
        assertEquals("Public", PublicObject.SOME_VALUE)
    }

    "should see internal object on classpath" {
        assertEquals("Internal", InternalObject.SOME_VALUE)
    }
})
