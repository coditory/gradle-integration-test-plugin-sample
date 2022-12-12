buildscript {
    dependencies {
        classpath(files("/home/mendlik/Development/gradle/gradle-integration-test-plugin/build/libs/integration-test-plugin.jar"))
    }
}

plugins {
    kotlin("jvm") version "1.7.10"
    // id("com.coditory.integration-test") version "1.4.4"
}

apply(plugin = "com.coditory.integration-test")

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.9.0")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.9.0")
}

tasks.withType<Test> {
    useJUnitPlatform()
    testLogging {
        events("passed", "failed", "skipped")
        setExceptionFormat("full")
    }
}
