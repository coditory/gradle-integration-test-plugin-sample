package com.coditory.sandbox;

import org.junit.Test;

import static com.coditory.sandbox.base.ClasspathFileReader.readFile;
import static org.junit.Assert.assertEquals;

public class ClasspathSetupSpec {
    @Test
    public void shouldReadATxtFileFromMain() {
        assertEquals("main-a", readFile("a.txt"));
    }

    @Test
    public void shouldReadBTxtFileFromTest() {
        assertEquals("test-b", readFile("b.txt"));
    }

    @Test
    public void shouldReadCTxtFileFromTest() {
        assertEquals("test-c", readFile("c.txt"));
    }
}
