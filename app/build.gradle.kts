plugins {
    id("com.android.application")
}

android {
    namespace = "com.example.webviewapp"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.webviewapp"
        minSdk = 21
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
}

dependencies {
}
