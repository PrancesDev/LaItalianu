plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("dev.flutter.flutter-gradle-plugin")
    id("com.google.gms.google-services")
}

android {
    namespace = "com.example.la_italianu"
    compileSdk = 36

    defaultConfig {
        applicationId = "com.example.la_italianu"
        minSdk = 23
        targetSdk = 36
        versionCode = 1
        versionName = "1.0"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            isShrinkResources= false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
}


dependencies {
    // Platforma Firebase - BOM
    implementation(platform("com.google.firebase:firebase-bom:33.16.0"))

    // Firebase Analytics (opțional)
    implementation("com.google.firebase:firebase-analytics")

    // Firebase Auth (login)
    implementation("com.google.firebase:firebase-auth")

    // Firebase Firestore (bază de date)
    implementation("com.google.firebase:firebase-firestore")
}
kotlin {
    jvmToolchain(17)
}
