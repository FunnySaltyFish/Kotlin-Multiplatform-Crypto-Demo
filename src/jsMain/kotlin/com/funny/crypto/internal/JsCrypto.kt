package com.funny.crypto.internal
import org.w3c.dom.Window

val CryptoJS by lazy {
    js("require('crypto-js')")
}

val Window.crypto: dynamic
    get() = CryptoJS