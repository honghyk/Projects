plugins {
    alias(libs.plugins.projectx.android.library)
    alias(libs.plugins.projectx.hilt)
}

android {
    namespace = "app.honghyk.projectx.data"
}

dependencies {
    implementation(projects.domain)

    testImplementation(libs.junit)
}
