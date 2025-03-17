import app.honghyk.projectx.implementation
import app.honghyk.projectx.ksp
import app.honghyk.projectx.libs
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.apply
import org.gradle.kotlin.dsl.dependencies

class HiltConventionPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
            apply(plugin = "com.google.devtools.ksp")
            dependencies {
                ksp(libs.findLibrary("hilt.android.compiler"))
            }

            pluginManager.withPlugin("com.android.base") {
                pluginManager.apply("dagger.hilt.android.plugin")
                dependencies {
                    implementation(libs.findLibrary("hilt.android"))
                }
            }
        }
    }
}
