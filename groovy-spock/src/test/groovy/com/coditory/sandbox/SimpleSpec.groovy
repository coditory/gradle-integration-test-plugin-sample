package com.coditory.sandbox

import spock.lang.Specification

class SimpleSpec extends Specification {
    def 'should sum two numbers'() {
        expect:
            2 + 2 == 4
    }
}
