# kotlinx.crypto Demo

This library is a demo project for GSoC 2023. It is a Kotlin Multiplatform library that provides cryptographic primitives and algorithms.
So far, it only defines some basic interface and implements the SHA256 and SHA512 in Kotlin/JVM and Kotlin/JS.

## What has been done
Currently, only Sha256 and Sha512 has been actually implemented in Kotlin/JVM and Kotlin/JS. They can be used like:

```kotlin
val sha256 = Crypto.Sha256   // lazy object
val hashedData = sha256.hash("Hello, Kotlin") // hex string
// or "Hello, Kotlin".sha256()
```

## How to run tests
To run this project, you need to have Node.js, NPM, Yarn and Chrome preinstalled.

You can see the test files in `./src/commonTest/kotlin/` and run them in your IDE.