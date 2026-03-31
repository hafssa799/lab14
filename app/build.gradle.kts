plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "sg.vantagepoint.lab14"
    compileSdk = 35
    defaultConfig {
        applicationId = "sg.vantagepoint.lab14"
        minSdk = 24
        targetSdk = 35
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
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
}

dependencies {
    android {
        namespace = "sg.vantagepoint.lab14"
        compileSdk = 36

        defaultConfig {
            applicationId = "sg.vantagepoint.lab14"
            minSdk = 24


            targetSdk = 35

            versionCode = 1
            versionName = "1.0"

            testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        }


    }

    dependencies {

        implementation("androidx.security:security-crypto:1.1.0-alpha06")

        implementation(libs.appcompat)
        implementation(libs.material)
        implementation(libs.activity)
        implementation(libs.constraintlayout)

    }

    implementation(libs.activity)
    implementation(libs.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)
}