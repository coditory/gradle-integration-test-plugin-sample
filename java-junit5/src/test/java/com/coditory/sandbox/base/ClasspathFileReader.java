package com.coditory.sandbox.base;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ClasspathFileReader {
    public static String readFile(String name) {
        try {
            URI uri = ClasspathFileReader.class.getClassLoader()
                .getResource(name)
                .toURI();
            Path path = Paths.get(uri);
            return Files.readString(path);
        } catch (IOException | URISyntaxException e) {
            throw new RuntimeException("Could not read file from classpath: " + name, e);
        }
    }
}
