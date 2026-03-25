package com.ryuken.dokusho

import androidx.compose.runtime.*
import com.ryuken.dokusho.book.presentation.book_list.BookListScreenRoot
import com.ryuken.dokusho.book.presentation.book_list.BookListViewModel
import org.jetbrains.compose.ui.tooling.preview.Preview


@Composable
@Preview
fun App() {
    BookListScreenRoot(
        viewModel = remember { BookListViewModel() },
        onBookClick = {

        }

    )
}