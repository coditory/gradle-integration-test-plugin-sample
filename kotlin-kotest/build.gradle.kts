plugins {
    kotlin("jvm") version "2.0.20"
    id("com.coditory.integration-test") version "2.0.0"
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.11.0")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.11.0")
    testImplementation("org.amshove.kluent:kluent:1.73")
    testImplementation("io.kotest:kotest-runner-junit5:5.9.1")
}

kotlin {
    jvmToolchain {
        languageVersion = JavaLanguageVersion.of(21)
    }
}

tasks.withType<Test> {
    useJUnitPlatform()
    testLogging {
        events("passed", "failed", "skipped")
        setExceptionFormat("full")
    }
}
