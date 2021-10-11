plugins {
    java
    application
}

group = "org.xendv.java.edumail"
version = "1.0"

repositories {
    mavenCentral()
    gradlePluginPortal()
}

dependencies {
    implementation("com.intellij:annotations:12.0")

    compileOnly("org.projectlombok:lombok:1.18.4")
    annotationProcessor("org.projectlombok:lombok:1.18.4")

    implementation(project(":models"))

    implementation("com.google.code.gson:gson:2.8.8")

    testImplementation("org.junit.jupiter:junit-jupiter-api:5.6.0")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}

tasks.register<JavaExec>("runApp") {
    group = "launch"

    mainClass.set( "Application")

    classpath = sourceSets["main"].runtimeClasspath
}

/*tasks.jar {
    manifest {
        attributes["Main-Class"]="Application";
    }
}*/

