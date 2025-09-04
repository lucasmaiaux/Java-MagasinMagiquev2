plugins {
    id("java")
}

group = "com.magasin"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testImplementation("com.approvaltests:approvaltests:25.0.23")
}

tasks.test {
    useJUnitPlatform()
}