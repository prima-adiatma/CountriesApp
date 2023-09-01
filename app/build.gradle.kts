plugins {
    id("com.android.application")
}

android {
    namespace = "com.project.countriesapp"
    compileSdk = 33

    defaultConfig {
        applicationId = "com.project.countriesapp"
        minSdk = 24
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
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }

    buildFeatures {
        viewBinding = true
    }
}

//val lifecycleExtensionVersion = "1.1.1"
//val butterknifeVersion = "10.1.0" //Deprecated
//val supportVersion = "29.0.0" sudah diganti dengan material
//val retrofitVersion = "2.9.0"
//val glideVersion = "4.16.0"
//val rxJavaVersion = "3.1.4"
//val daggerVersion = "5.0.0"
//val mockitoVersion = "3.9.7"

dependencies {



    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.9.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")

    // New Dependencies
    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))

    implementation("android.arch.lifecycle:extensions:1.1.1")

//    implementation("com.jakewharton:butterknife:$butterknifeVersion") //Deprecated
//    annotationProcessor("com.jakewharton:butterknife-compiler:$butterknifeVersion") //Deprecated

    implementation("com.squareup.retrofit2:retrofit:2.9.0")
    implementation("com.squareup.retrofit2:converter-gson:2.9.0")
    implementation("com.squareup.retrofit2:adapter-rxjava2:2.9.0")

    implementation("io.reactivex.rxjava2:rxjava:2.2.21")
    implementation("io.reactivex.rxjava2:rxandroid:2.1.1")

    implementation("com.github.bumptech.glide:glide:4.16.0")

    implementation("com.google.dagger:dagger:2.48")
    implementation("com.google.dagger:dagger-android-support:2.48")
    implementation("androidx.legacy:legacy-support-v4:1.0.0")
    annotationProcessor("com.google.dagger:dagger-compiler:2.48")
    annotationProcessor("com.google.dagger:dagger-android-processor:2.48")

    testImplementation("org.mockito:mockito-inline:5.2.0")
    testImplementation("android.arch.core:core-testing:1.1.1")


}