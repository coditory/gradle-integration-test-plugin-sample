package com.coditory.sandbox;

import org.junit.jupiter.api.Test;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClasspathSetupSpec {
    @Test
    public void shouldReadATxtFileFromMain() throws Exception {
        assertEquals("main-a", readFile("a.txt"));
    }

    @Test
    public void shouldReadBTxtFileFromTest() throws Exception {
        assertEquals("test-b", readFile("b.txt"));
    }

    @Test
    public void shouldReadCTxtFileFromTest() throws Exception {
        assertEquals("test-c", readFile("c.txt"));
    }

    private String readFile(String name) throws Exception {
        Path path = Paths.get(getClass().getClassLoader().getResource(name).toURI());
        return Files.readString(path);
    }
}
