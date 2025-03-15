plugins {
    alias(libs.plugins.projectx.android.library)
    alias(libs.plugins.projectx.android.library.compose)
    alias(libs.plugins.projectx.hilt)
}

android {
    namespace = "app.honghyk.projectx.presentation"
}

dependencies {
    implementation(projects.domain)
}