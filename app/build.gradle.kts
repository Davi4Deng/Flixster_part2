plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
}

android {
    namespace = "com.example.flixsterforthebestmovie"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.flixsterforthebestmovie"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

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
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {

    implementation (libs.androidx.core.ktx.v170)
    implementation (libs.androidx.appcompat.v142)
    implementation (libs.material.v160)
    implementation (libs.gson)
    implementation (libs.androidx.constraintlayout)
    testImplementation (libs.junit)
    androidTestImplementation (libs.androidx.junit.v113)
    androidTestImplementation (libs.androidx.espresso.core.v340)
    implementation (libs.asynchttpclient)
    implementation (libs.glide)
    annotationProcessor (libs.compiler)

}