plugins {
    kotlin("jvm") version "2.0.21"
    application
}

group = "org.affirm"
version = "unspecified"

repositories {
    mavenCentral()
}

dependencies {
    implementation("io.ktor:ktor-server-core:3.0.3")
    implementation("io.ktor:ktor-server-netty:3.0.3")
    testImplementation("io.ktor:ktor-server-tests:3.0.3")
    testImplementation(kotlin("test"))
    implementation(project(":processing"))

}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(17)
}

application {
    mainClass.set("org.affirm.MainKt")
}