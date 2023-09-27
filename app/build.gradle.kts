plugins {
    id("com.android.application")
}

android {
    namespace = "com.example.samostoyatelnaya_5"
    compileSdk = 33

    defaultConfig {
        applicationId = "com.example.samostoyatelnaya_5"
        minSdk = 33
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {

    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.9.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation ("com.squareup.retrofit2:retrofit:1.6.1")
    implementation ("androidx.room:room-rxjava2:2.5.2")
    implementation ("co.infinum:goldfinger:2.1.0")
    implementation ("com.infinum.dbinspector:dbinspector:5.4.9")
    implementation ("com.github.bumptech.glide:glide:4.12.0")
    implementation ("org.achartengine:achartengine:1.2.0")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
}