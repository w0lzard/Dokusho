package com.ryuken.dokusho

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "Dokusho",
    ) {
        App()
    }
}