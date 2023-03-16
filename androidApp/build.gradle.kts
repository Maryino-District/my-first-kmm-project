plugins {
    id(androidApp)
    kotlin(kotlinAndroidPlugin)
}

android {
    namespace = "com.example.my_first_kmm_project.android"
    compileSdk = Versions.compile_sdk
    defaultConfig {
        applicationId = "com.example.my_first_kmm_project.android"
        minSdk = Versions.min_sdk
        targetSdk = Versions.target_sdk
        versionCode = 1
        versionName = "1.0"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = Versions.compose_compiler_version
    }
    packagingOptions {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }
    buildToolsVersion = Versions.build_tools
}

dependencies {
    implementation(project(":shared"))
    Depends.Compose.run {
        implementation(compiler)
        implementation(runtime)
        implementation(runtime_livedata)
        implementation(ui)
        implementation(tooling)
        implementation(foundation)
        implementation(foundationLayout)
        implementation(material)
        implementation(material_icons)
        implementation(activity)
    }
    Depends.run {
        implementation(napier)
        implementation(material)
    }
}