package com.coditory.sandbox

import com.coditory.sandbox.base.ClasspathFileReader.readFile
import io.kotest.core.spec.style.FreeSpec
import org.amshove.kluent.`should be equal to`

class ClasspathSetupSpec : FreeSpec({
    "should read a txt file from main" {
        readFile("a.txt") `should be equal to` "main-a"
    }

    "should read b txt file from test" {
        readFile("b.txt") `should be equal to` "test-b"
    }

    "should read c txt file from test" {
        readFile("c.txt") `should be equal to` "test-c"
    }
})
