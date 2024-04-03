// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id("com.android.library") version "8.3.0" apply false
    id("org.jetbrains.kotlin.android") version "1.9.23" apply false
}

buildscript {
    repositories {
        maven(url="https://jitpack.io")
        mavenCentral()
        google()
    }

    dependencies {
        classpath("com.github.dcendents:android-maven-gradle-plugin:2.1")
    }
}

task("clean", Delete::class) {
    delete = setOf(rootProject.buildDir)
}