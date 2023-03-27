package com.funny.crypto

import com.funny.crypto.internal.HashFunction

interface Sha: HashFunction

expect object Sha256Factory {
    fun create(): Sha
}

expect object Sha512Factory {
    fun create(): Sha
}


