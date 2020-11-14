package com.coditory.sandbox

import com.coditory.sandbox.base.ClasspathFileReader.readFile
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ClasspathSetupSpec {
    @Test
    fun shouldReadATxtFileFromMain() {
        assertEquals("main-a", readFile("a.txt"))
    }

    @Test
    fun shouldReadBTxtFileFromTest() {
        assertEquals("test-b", readFile("b.txt"))
    }

    @Test
    fun shouldReadCTxtFileFromTest() {
        assertEquals("test-c", readFile("c.txt"))
    }
}
