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
    implementation(group="com.intellij", name="annotations", version="12.0")
    implementation("com.google.code.gson:gson:2.8.8")

    //compileOnly("org.projectlombok:lombok:1.18.4")
    //annotationProcessor("org.projectlombok:lombok:1.18.4")

    implementation(project(":models"))
    implementation(project(":controller"))

    testImplementation("org.junit.jupiter:junit-jupiter-api:5.6.0")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}
application{
    mainClass.set("Application");
}

tasks.jar {
    manifest {
        attributes["Main-Class"]="Application";
    }
    //archiveBaseName.set("${project.name}-fat")
    //from(configurations.compileClasspath.get().map { if (it.isDirectory()) it else zipTree(it) })
    //with(jar.get() as CopySpec)
    configurations["compileClasspath"].forEach { file: File ->
        from(zipTree(file.absoluteFile))
    }

}
