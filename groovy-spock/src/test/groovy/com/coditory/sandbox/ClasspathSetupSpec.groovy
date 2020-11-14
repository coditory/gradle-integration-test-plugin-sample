package com.coditory.sandbox


import spock.lang.Specification

import static com.coditory.sandbox.base.ClasspathFileReader.readFile

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
}
