plugins {
    kotlin("jvm") version "1.9.0"
    application

    id("maven-publish")
}

group = "com.dietrich"
version = "0.0.1"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.jetbrains.kotlinx:kotlinx-html-jvm:0.9.1")
    implementation("io.ktor:ktor-server-core-jvm:2.3.5")

    testImplementation(kotlin("test"))
}

publishing {
    repositories {
        maven {
            name = "htmx-ktor"
            url = uri("https://maven.pkg.github.com/rafaelladi/htmx-ktor")
            credentials {
//                username = project.findProperty("gpr.user")?.toString() ?: System.getenv("GITHUB_USER")
                password = project.findProperty("gpr.key")?.toString() ?: System.getenv("GITHUB_TOKEN")
            }
        }
    }
    publications {
        register<MavenPublication>("gpr") {
            from(components["java"])
        }
    }
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(8)
}