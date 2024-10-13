package com.coditory.sandbox

import spock.lang.Specification

class SimpleIntegrationSpec extends Specification {
    def 'should sum two numbers'() {
        expect:
            2 + 2 == 4
    }
}
