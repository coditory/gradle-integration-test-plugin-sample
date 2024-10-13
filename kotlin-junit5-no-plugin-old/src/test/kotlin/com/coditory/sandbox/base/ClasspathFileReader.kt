package com.coditory.sandbox.base

import java.net.URI
import java.nio.file.Files
import java.nio.file.Paths

object ClasspathFileReader {
    fun readFile(name: String): String {
        val uri: URI = ClasspathFileReader::class.java.classLoader
            ?.getResource(name)
            ?.toURI()!!
        return Files.readString(Paths.get(uri))
    }
}
