package com.funny.crypto

object Crypto {
    val Sha256 by defaultLazy { Sha256Factory.create() }
    val Sha512 by defaultLazy { Sha512Factory.create() }
}

private fun <T> defaultLazy(initializer: () -> T)
    = lazy(LazyThreadSafetyMode.NONE, initializer = initializer)