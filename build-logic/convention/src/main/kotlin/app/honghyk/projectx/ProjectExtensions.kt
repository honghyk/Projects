package app.honghyk.projectx

import org.gradle.api.Project
import org.gradle.api.artifacts.MinimalExternalModuleDependency
import org.gradle.api.artifacts.VersionCatalogsExtension
import org.gradle.api.provider.Provider
import org.gradle.kotlin.dsl.DependencyHandlerScope
import org.gradle.kotlin.dsl.getByType
import java.util.Optional

fun DependencyHandlerScope.implementation(
    artifact: Optional<Provider<MinimalExternalModuleDependency>>
) {
    add("implementation", artifact.get())
}

fun DependencyHandlerScope.ksp(
    artifact: Optional<Provider<MinimalExternalModuleDependency>>
) {
    add("ksp", artifact.get())
}

val Project.libs
    get() = extensions.getByType<VersionCatalogsExtension>().named("libs")
