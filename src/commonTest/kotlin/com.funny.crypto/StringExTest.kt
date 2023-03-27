package com.funny.crypto

import kotlin.test.Test
import kotlin.test.assertEquals

class StringExTest {
    @Test
    fun testToHexString() {
        val bytes = byteArrayOf(0xDE.toByte(), 0xAD.toByte(), 0xBE.toByte(), 0xEF.toByte())
        val hexString = bytes.toHexString()
        assertEquals("deadbeef", hexString)
        val hexStringUppercase = bytes.toHexString(true)
        assertEquals("DEADBEEF", hexStringUppercase)
    }
}