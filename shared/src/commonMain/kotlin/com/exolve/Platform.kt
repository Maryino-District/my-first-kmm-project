package com.exolve

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform