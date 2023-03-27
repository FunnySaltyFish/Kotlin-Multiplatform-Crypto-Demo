package com.funny.crypto

import com.funny.crypto.internal.CryptoJS

actual object Sha256Factory {
    /**
     * Sha256 Js implementation
     *
     * @return
     */
    actual fun create(): Sha {
        return object: Sha {
            override fun hash(data: String): String {
                val hash = CryptoJS.SHA256(data)
                return hash.toString(CryptoJS.enc.Hex) as String
            }
        }
    }
}

actual object Sha512Factory {
    /**
     * Sha512 Js implementation
     *
     */
    actual fun create() = object : Sha {
        override fun hash(data: String): String {
            val hash = CryptoJS.SHA512(data)
            return hash.toString(CryptoJS.enc.Hex) as String
        }
    }
}