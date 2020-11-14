package com.coditory.sandbox.base

import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.Paths

class ClasspathFileReader {
    static String readFile(String name) throws Exception {
        Path path = Paths.get(ClasspathFileReader.class.getClassLoader().getResource(name).toURI())
        return Files.readString(path)
    }
}
