package com.coditory.sandbox;

import org.junit.jupiter.api.Test;

import static com.coditory.sandbox.base.ClasspathFileReader.readFile;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClasspathSetupIntegrationSpec {
    @Test
    public void shouldReadATxtFileFromMain() {
        assertEquals("main-a", readFile("a.txt"));
    }

    @Test
    public void shouldReadBTxtFileFromTest() {
        assertEquals("test-b", readFile("b.txt"));
    }

    @Test
    public void shouldReadCTxtFileFromIntegration() {
        assertEquals("integration-c", readFile("c.txt"));
    }
}
