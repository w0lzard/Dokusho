package com.ryuken.dokusho.book.data.network

import androidx.room.Query
import com.ryuken.dokusho.book.data.dto.SearchResponseDto
import com.ryuken.dokusho.core.domain.DataError

interface RemoteBookDataSource {
    suspend fun searchBooks(
        query: String,
        resultLimit: Int? =null
    ): Result<SearchResponseDto, DataError.Remote>
}