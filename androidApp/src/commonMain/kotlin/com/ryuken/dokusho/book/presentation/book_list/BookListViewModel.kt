package com.ryuken.dokusho.book.presentation.book_list

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class BookListViewModel : ViewModel() {

    private val _state = MutableStateFlow(BookListState())
    val state = _state.asStateFlow()


    fun onAction(action: BookListAction) {
        when (action) {
            is BookListAction.onSearchQueryChange -> {
                _state.update { it.copy(searchQueries = action.query) }
            }

            is BookListAction.onBookClick -> {
                // Handle book click
            }

            is BookListAction.onTabSelected -> {
                _state.update { it.copy(selectedTabIndec = action.index) }
            }
        }
    }
}