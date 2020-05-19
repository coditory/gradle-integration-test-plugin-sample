package com.coditory.sandbox;

import org.junit.Test;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.Assert.assertEquals;

public class ClasspathSetupIntegrationSpec {
    @Test
    public void shouldReadATxtFileFromMain() throws Exception {
        assertEquals("main-a", readFile("a.txt"));
    }

    @Test
    public void shouldReadBTxtFileFromTest() throws Exception {
        assertEquals("test-b", readFile("b.txt"));
    }

    @Test
    public void shouldReadCTxtFileFromIntegration() throws Exception {
        assertEquals("integration-c", readFile("c.txt"));
    }

    private String readFile(String name) throws Exception {
        Path path = Paths.get(getClass().getClassLoader().getResource(name).toURI());
        return Files.readString(path);
    }
}
