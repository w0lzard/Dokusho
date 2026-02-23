package com.ryuken.dokusho.book.presentation.book_list

import com.ryuken.dokusho.book.domain.Book

sealed interface BookListAction {
    data class onSearchQueryChange(val query: String) : BookListAction
    data class onBookClick(val book: Book) : BookListAction
    data class onTabSelected(val index: Int) : BookListAction
}