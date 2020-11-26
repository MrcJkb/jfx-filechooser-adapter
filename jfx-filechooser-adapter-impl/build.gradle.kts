plugins {
  java
  idea
  id("org.openjfx.javafxplugin") version "0.0.9"
  kotlin("jvm") version "1.4.10"
  id("org.jetbrains.kotlin.plugin.jpa") version "1.4.10"
  id("org.jetbrains.kotlin.plugin.noarg") version "1.4.10"
}

group = "com.github.mrcjkb"

repositories {
  mavenCentral()
  jcenter()
}

dependencies {
  implementation(project(":jfx-filechooser-adapter-api"))
  implementation(kotlin("stdlib"))
  implementation("org.openjfx:javafx-swing:11.0.2")
  implementation("org.openjfx:javafx-graphics:11.0.2:win")
  implementation("org.openjfx:javafx-graphics:11.0.2:linux")
  implementation("org.openjfx:javafx-graphics:11.0.2:mac")
  testImplementation("com.tngtech.archunit:archunit-junit5:0.14.1")
  testImplementation("io.kotlintest:kotlintest-runner-junit5:3.4.2")
}

javafx {
  version = "11"
  modules = listOf("javafx.base", "javafx.graphics", "javafx.swing")
}

tasks.test {
  useJUnitPlatform()
}