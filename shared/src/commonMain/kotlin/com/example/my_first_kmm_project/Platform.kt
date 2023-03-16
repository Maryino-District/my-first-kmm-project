package com.example.my_first_kmm_project

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform