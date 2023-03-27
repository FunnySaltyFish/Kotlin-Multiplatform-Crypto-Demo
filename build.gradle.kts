plugins {
    kotlin("multiplatform") version "1.7.10"
}

group = "com.funny.crypto"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

kotlin {
    // refer to https://kotlinlang.org/docs/multiplatform-set-up-targets.html
    jvm {
        compilations.all {
            kotlinOptions.jvmTarget = "1.8"
        }
        withJava()
        testRuns["test"].executionTask.configure {
            useJUnitPlatform()
        }
    }
    js(BOTH) {
        browser {
            testTask {
                useKarma {
                    useDebuggableChrome()
                }
            }
            commonWebpackConfig {
                cssSupport.enabled = true
            }
        }
    }
    
    sourceSets {
        val commonMain by getting
        val commonTest by getting {
            dependencies {
                implementation(kotlin("test"))
            }
        }
        val jvmMain by getting
        val jvmTest by getting
        val jsMain by getting {
            dependencies {
                implementation(npm("crypto-js", "latest"))
            }
        }
        val jsTest by getting {
            dependencies {
                implementation(npm("crypto-js", "latest"))
            }
        }
    }
}

rootProject.plugins.withType<org.jetbrains.kotlin.gradle.targets.js.nodejs.NodeJsRootPlugin> {
    // use the pre-installed Node.js instance
    rootProject.the<org.jetbrains.kotlin.gradle.targets.js.nodejs.NodeJsRootExtension>().download = false
}

rootProject.plugins.withType<org.jetbrains.kotlin.gradle.targets.js.yarn.YarnPlugin> {
    // use the pre-installed Yarn instance
    rootProject.the<org.jetbrains.kotlin.gradle.targets.js.yarn.YarnRootExtension>().download = false
    // or true for default behavior
}