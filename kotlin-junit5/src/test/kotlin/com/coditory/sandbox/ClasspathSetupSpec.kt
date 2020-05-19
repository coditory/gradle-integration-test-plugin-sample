package com.coditory.sandbox

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.assertEquals

import java.nio.file.Files
import java.nio.file.Paths

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

    private fun readFile(name: String): String {
        val path = Paths.get(javaClass.classLoader.getResource(name).toURI())
        return Files.readString(path)
    }
}