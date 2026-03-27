
package com.ryuken.dokusho

import androidx.compose.runtime.remember
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import com.ryuken.dokusho.app.App
import com.ryuken.dokusho.di.initKoin
import io.ktor.client.engine.okhttp.OkHttp

fun main() {
    initKoin()
    application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "Dokusho",
    ) {
        App(
            engine = remember { OkHttp.create() }
        )
    }
}
}