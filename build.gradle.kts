plugins {
    //trick: for the same plugin versions in all sub-modules
    id(androidApp).version(Versions.android_app).apply(false)
    id(androidLib).version(Versions.android_lib).apply(false)
    kotlin(kotlinAndroidPlugin).version(Versions.kotlin_android).apply(false)
    kotlin(kotlinMultiplatformPlugin).version(Versions.kotlin_multiplatform).apply(false)
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}
