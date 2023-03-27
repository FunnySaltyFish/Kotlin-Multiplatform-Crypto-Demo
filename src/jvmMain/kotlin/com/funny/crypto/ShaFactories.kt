package com.funny.crypto

actual object Sha256Factory {
    actual fun create(): Sha {
        return object: Sha {
            /**
             * Sha256 Jvm implementation
             *
             * @param data
             * @return
             */
            override fun hash(data: String): String {
                val sha256 = java.security.MessageDigest.getInstance("SHA-256")
                return sha256.digest(data.toByteArray()).toHexString()
            }

            override fun hash(byteArray: ByteArray): String {
                val sha256 = java.security.MessageDigest.getInstance("SHA-256")
                return sha256.digest(byteArray).toHexString()
            }
        }
    }
}

actual object Sha512Factory {
    actual fun create(): Sha {
        return object: Sha {
            /**
             * Sha256 Jvm implementation
             *
             * @param data
             * @return
             */
            override fun hash(data: String): String {
                val sha512 = java.security.MessageDigest.getInstance("SHA-512")
                return sha512.digest(data.toByteArray()).toHexString()
            }

            override fun hash(byteArray: ByteArray): String {
                val sha512 = java.security.MessageDigest.getInstance("SHA-512")
                return sha512.digest(byteArray).toHexString()
            }
        }
    }
}