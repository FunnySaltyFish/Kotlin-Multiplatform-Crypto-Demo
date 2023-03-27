package com.funny.crypto

import kotlin.test.Test
import kotlin.test.assertEquals

// Test Sha functions
class ShaTest {
    @Test
    fun testSha256(){
        testSha(Crypto.Sha256, "Hello World", "a591a6d40bf420404a011733cfb7b190d62c65bf0bcda32b57b277d9ad9f146e")
    }

    @Test
    fun testSha512(){
        testSha(Crypto.Sha512, "hello", "9b71d224bd62f3785d96d46ad3ea3d73319bfbc2890caadae2dff72519673ca72323c3d99ba5c11d7c7acc6e14b8c5da0c4663475c2e5c3adef46f73bcdec043")
    }

    private fun testSha(sha: Sha, origin: String, expected: String) {
        val hash = sha.hash(origin)
        assertEquals(expected, hash)
        val hashByArray = sha.hash(origin.encodeToByteArray())
        assertEquals(hash, hashByArray)
    }
}