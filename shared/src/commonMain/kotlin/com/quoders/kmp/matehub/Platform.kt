package com.quoders.kmp.matehub

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform