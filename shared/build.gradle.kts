import org.jetbrains.kotlin.konan.target.Family

plugins {
    alias(libs.plugins.kotlinMultiplatform)

}

kotlin {
    listOf(
        iosX64(),
        iosArm64(),
        iosSimulatorArm64(),
    ).forEach { target ->
        target.binaries.framework {
            baseName = "Shared"
            isStatic = true
        }
    }

    listOf(
        tvosArm64(),
        tvosSimulatorArm64(),
        tvosX64()
    ).forEach() { target ->
        target.binaries.framework {
            baseName = "Shared"
            isStatic = true
            export(":shared")
        }
    }

    sourceSets {
        commonMain.dependencies {
            // put your Multiplatform dependencies here
        }
        tvosMain.dependencies {
            // put your Multiplatform dependencies here
        }
    }
}

