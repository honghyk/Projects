plugins {
    alias(libs.plugins.projectx.android.library)
    alias(libs.plugins.projectx.hilt)
}

android {
    namespace = "app.honghyk.projectx.database"
}

dependencies {
    implementation(projects.data)

    testImplementation(libs.junit)
}