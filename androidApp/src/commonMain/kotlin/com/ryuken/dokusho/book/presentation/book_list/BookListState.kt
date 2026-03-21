package com.ryuken.dokusho.book.presentation.book_list

import com.ryuken.dokusho.core.presentation.UiText

data class BookListState(
    val searchQueries : String = "One Piece",
    val searchResults : List<String> = emptyList(),
    val favouriteBooks : List<String> = emptyList(),
    val isLoading : Boolean = false,
    val selectedTabIndec : Int = 0,
    val errorMessage : UiText? = null

)
