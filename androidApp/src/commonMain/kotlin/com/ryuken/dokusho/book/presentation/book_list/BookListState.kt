package com.ryuken.dokusho.book.presentation.book_list

import com.ryuken.dokusho.book.domain.Book
import com.ryuken.dokusho.core.presentation.UiText

data class BookListState(
    val searchQuery: String = "One Piece",
    val searchResults: List<Book> = books,
    val favoriteBooks: List<Book> = emptyList(),
    val isLoading: Boolean = true,
    val selectedTabIndex: Int = 0,
    val errorMessage: UiText? = null
)

val books = (1..100).map {
    Book(
        id = it.toString(),
        title = "Book Title $it",
        authors = listOf("RyuKen No Wolzard"),
        description = "Description for Book $it",
        imageUrl = "https://via.placeholder.com/150",
        languages = emptyList(),
        firstPublishYear = null,
        averageRating = 4.67854,
        ratingCount = 5,
        numPages = 40489,
        numEditions = 8
    )
}