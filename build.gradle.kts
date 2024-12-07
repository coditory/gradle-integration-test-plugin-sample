//buildscript {
//    repositories {
//        maven {
//            url = uri("https://plugins.gradle.org/m2/")
//        }
//    }
//    dependencies {
//        classpath(files("/Users/mendlik/Code/gradle/gradle-integration-test-plugin/build/libs/integration-test-plugin-2.1.0.jar"))
//        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:2.0.21")
//    }
//}
//
//apply(plugin = "com.coditory.integration-test")

plugins {
    kotlin("jvm") version "2.0.20"
    id("com.coditory.integration-test") version "2.2.0"
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.11.1")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.11.1")
    integrationImplementation("com.coditory.quark:quark-context:0.1.22")
}

// To test if config is lazy run:
// ./gradlew clean
// There should be no "Running test configuration...." in the logs
tasks.withType<Test>().configureEach {
    println("Running test configuration....")
}
