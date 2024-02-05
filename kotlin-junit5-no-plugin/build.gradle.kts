plugins {
    kotlin("jvm") version "1.9.22"
}

repositories {
    mavenCentral()
}

// source: https://docs.gradle.org/current/userguide/java_testing.html#sec:configuring_java_integration_tests
// <<< BEGINNING OF INTEGRATION TEST CONFIGURATION WITHOUT A PLUGIN

sourceSets {
    create("integration") {
        compileClasspath += sourceSets.test.get().output
        runtimeClasspath += sourceSets.test.get().output
    }
}

val integrationImplementation by configurations.getting {
    extendsFrom(configurations.testImplementation.get())
}

val integrationRuntimeOnly by configurations.getting {
    extendsFrom(configurations.testRuntimeOnly.get())
}

val integrationTest = task<Test>("integrationTest") {
    description = "Runs integration tests."
    group = "verification"
    testClassesDirs = sourceSets["integration"].output.classesDirs
    classpath = sourceSets["integration"].runtimeClasspath
    shouldRunAfter("test")
}

tasks.check { dependsOn(integrationTest) }

kotlin.target.compilations.getByName("integration") {
    associateWith(target.compilations.getByName("test"))
    associateWith(target.compilations.getByName("main"))
}

// >>> END

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.10.2")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.10.1")
    // just a sample dependency to prove correctness
    integrationImplementation("com.coditory.quark:quark-context:0.1.15")
}

kotlin {
    jvmToolchain {
        languageVersion.set(JavaLanguageVersion.of(17))
    }
}

tasks.withType<Test> {
    useJUnitPlatform()
    testLogging {
        events("passed", "failed", "skipped")
        setExceptionFormat("full")
    }
}
