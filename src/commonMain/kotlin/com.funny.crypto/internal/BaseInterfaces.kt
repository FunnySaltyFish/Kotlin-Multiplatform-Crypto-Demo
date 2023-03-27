package com.funny.crypto.internal

/**
 * Some base interfaces for crypto
 */

interface SymmetricEncryption {
    fun encrypt(data: ByteArray, key: ByteArray): ByteArray
    fun decrypt(data: ByteArray, key: ByteArray): ByteArray
}

interface AsymmetricEncryption {
    fun encrypt(data: ByteArray, publicKey: ByteArray): ByteArray
    fun decrypt(data: ByteArray, privateKey: ByteArray): ByteArray
}

/**
 * Interface for Hash functions
 *
 * **Note:** THIS IS A DEMO IMPLEMENTATION, WE DO NOT CONSIDER `Multipart Computation` IN THIS IMPLEMENTATION
 *
 */
interface HashFunction {
    fun hash(data: String): String
    fun hash(byteArray: ByteArray): String = hash(byteArray.decodeToString())
}

interface MessageAuthenticationCode {
    fun generate(data: ByteArray, key: ByteArray): ByteArray
}