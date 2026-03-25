package com.ryuken.dokusho.book.data.network

import com.ryuken.dokusho.book.data.dto.BookWorkDto
import com.ryuken.dokusho.book.data.dto.SearchResponseDto
import com.ryuken.dokusho.core.domain.DataError
import com.ryuken.dokusho.core.domain.Result

interface RemoteBookDataSource {
    suspend fun searchBooks(
        query: String,
        resultLimit: Int? = null
    ): Result<SearchResponseDto, DataError.Remote>

    suspend fun getBookDetails(bookWorkId: String): Result<BookWorkDto, DataError.Remote>
}