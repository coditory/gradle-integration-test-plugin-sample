package com.coditory.sandbox

import com.coditory.quark.context.Context
import com.coditory.sandbox.base.ClasspathFileReader.readFile
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ClasspathSetupIntegrationSpec {
    @Test
    fun shouldReadATxtFileFromMain() {
        assertEquals("main-a", readFile("a.txt"))
    }

    @Test
    fun shouldReadBTxtFileFromTest() {
        assertEquals("test-b", readFile("b.txt"))
    }

    @Test
    fun shouldReadCTxtFileFromIntegration() {
        assertEquals("integration-c", readFile("c.txt"))
    }
}
