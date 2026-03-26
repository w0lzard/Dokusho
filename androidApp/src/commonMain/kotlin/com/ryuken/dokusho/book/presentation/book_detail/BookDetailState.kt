package com.ryuken.dokusho.book.presentation.book_detail

import com.ryuken.dokusho.book.domain.Book

data class BookDetailState(
    val isLoading: Boolean = true,
    val isFavorite: Boolean = false,
    val book: Book? = null
)