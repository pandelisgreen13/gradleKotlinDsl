object Config {
    const val compileSdk = 29
    const val minSdk = 21
    const val targetSdk = 29
    const val versionCode = 1
    const val versionName = "1.0.0"
    const val applicationId = "com.pchasapis.navigationcomponent"
}

object Versions {
    const val kotlinVersion = "1.3.72"
    const val appcompat = "1.0.2"
    const val gradleVersion = "4.0.1"
    const val kotlinKtx = "1.3.0"
    const val constraintlayout = "1.1.3"

    /* test */
    const val junit = "4.12"
}

object Libs {
    const val kotlin = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.kotlinVersion}"
    const val kotlinKtx = "androidx.core:core-ktx:${Versions.kotlinKtx}"
    const val appcompat = "androidx.appcompat:appcompat:${Versions.appcompat}"
    const val constraintlayout = "androidx.constraintlayout:constraintlayout:${Versions.constraintlayout}"
}

object Plugins {
    const val kotlin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlinVersion}"
    const val gradle = "com.android.tools.build:gradle:${Versions.gradleVersion}"

}