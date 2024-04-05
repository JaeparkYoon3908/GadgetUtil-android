plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
    `maven-publish`
}

val gadGetGroupName = "com.github.YoonJaePark3908"
val gadGetVersion = "0.0.36"

group = gadGetGroupName
version = gadGetVersion

android {
    namespace = "com.gadget"
    compileSdk = libs.versions.compileSdk.get().toInt()

    defaultConfig {
        minSdk = libs.versions.minSdk.get().toInt()
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    kotlinOptions {
        jvmTarget = "17"
    }
}

dependencies {
    implementation(libs.androidx.core.ktx)
    implementation(fileTree(mapOf(
        "dir" to "../gradle/wrapper",
        "include" to listOf("*.aar", "*.jar"),
        "exclude" to listOf("*.aar", "*.jar")
    )))
    testImplementation(libs.junit.junit)
    androidTestImplementation(libs.junit)
    androidTestImplementation(libs.androidx.test.espresso.core)
}

afterEvaluate {
    publishing {
        publications {
            create<MavenPublication>("release") {
                groupId = gadGetGroupName
                artifactId = "GadgetUtil-android"
                version = gadGetVersion
            }
        }
    }
}

tasks.withType<AbstractArchiveTask> {
    if(this.name == "releaseSourcesJar" || this.name == "debugSourcesJar") {
        enabled = false
    }
}
