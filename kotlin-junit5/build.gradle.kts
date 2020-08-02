plugins {
    kotlin("jvm") version "1.3.70"
    id("com.coditory.integration-test") version "1.1.7"
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))
    implementation(kotlin("reflect"))
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.6.1")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.6.1")
}

tasks.withType<Test> {
    useJUnitPlatform()
}
