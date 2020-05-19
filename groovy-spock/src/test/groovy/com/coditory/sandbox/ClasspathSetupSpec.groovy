package com.coditory.sandbox

import spock.lang.Specification

import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.Paths

class ClasspathSetupSpec extends Specification {
    def 'should read a.txt file from main'() {
        expect:
            readFile("a.txt") == "main-a"
    }

    def 'should read b.txt file from test'() {
        expect:
            readFile("b.txt") == "test-b"
    }

    def 'should read c.txt file from test'() {
        expect:
            readFile("c.txt") == "test-c"
    }

    private String readFile(String name) throws Exception {
        Path path = Paths.get(getClass().getClassLoader().getResource(name).toURI());
        return Files.readString(path);
    }
}
