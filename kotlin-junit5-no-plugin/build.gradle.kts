plugins {
    kotlin("jvm") version "2.0.20"
    `jvm-test-suite`
}

repositories {
    mavenCentral()
}

testing {
    @Suppress("UnstableApiUsage")
    suites {
        withType<JvmTestSuite> {
            useJUnitJupiter()
            targets.configureEach {
                testTask {
                    testLogging {
                        events("passed", "failed", "skipped")
                        setExceptionFormat("full")
                    }
                }
            }
        }
        val test by getting(JvmTestSuite::class)
        val integrationTest by registering(JvmTestSuite::class) {
            testType.set(TestSuiteType.INTEGRATION_TEST)
            targets.all {
                testTask.configure {
                    shouldRunAfter(test)
                }
            }
        }
    }
}

tasks.named("check") {
    dependsOn(testing.suites.named("integrationTest"))
}

kotlin {
    jvmToolchain {
        languageVersion = JavaLanguageVersion.of(21)
    }
    target.compilations {
        getByName("integrationTest")
            .associateWith(getByName("test"))
    }
}

val integrationTestImplementation by configurations

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.11.0")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.11.0")
    // just a sample dependency to prove correctness
    integrationTestImplementation("com.coditory.quark:quark-context:0.1.15")
}