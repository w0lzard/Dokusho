package com.ryuken.dokusho

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform