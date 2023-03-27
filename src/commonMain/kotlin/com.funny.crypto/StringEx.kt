package com.funny.crypto

/**
 * Some string extensions
 */

private const val HEX_CHARS = "0123456789abcdef"

/**
 * Convert a byte array to a hex string
 * @param uppercase Whether to use uppercase characters (A-F)
 * @return
 */
fun ByteArray.toHexString(uppercase: Boolean = false): String {
    val builder = StringBuilder(size * 2)
    for (byte in this) {
        val i = byte.toInt() and 0xFF
        builder.append(HEX_CHARS[i shr 4])
        builder.append(HEX_CHARS[i and 0x0F])
    }
    val result = builder.toString()
    return if (uppercase) result.uppercase() else result
}

/**
 * below are some extensions for crypto
 */

fun String.sha256() = Crypto.Sha256.hash(this)
fun String.sha512() = Crypto.Sha512.hash(this)