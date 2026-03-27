package com.ryuken.dokusho

import androidx.compose.ui.window.ComposeUIViewController
import com.ryuken.dokusho.app.App
import com.ryuken.dokusho.di.initKoin

fun MainViewController() = ComposeUIViewController (
    configure = {
        initKoin()
    }
){ App() }