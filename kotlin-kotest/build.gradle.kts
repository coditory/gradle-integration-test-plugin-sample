plugins {
    kotlin("jvm") version "1.7.0"
    id("com.coditory.integration-test") version "1.4.2"
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.7.2")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.7.2")
    testImplementation("org.amshove.kluent:kluent:1.68")
    testImplementation("io.kotest:kotest-runner-junit5:5.3.2")
}

tasks.withType<Test> {
    useJUnitPlatform()
    testLogging {
        events("passed", "failed", "skipped")
        setExceptionFormat("full")
    }
}
