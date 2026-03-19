package com.ryuken.dokusho.book.data.repository

import com.ryuken.dokusho.book.data.network.RemoteBookDataSource
import com.ryuken.dokusho.book.domain.Book
import com.ryuken.dokusho.book.domain.BookRepository
import com.ryuken.dokusho.core.domain.DataError
import com.ryuken.dokusho.core.domain.Result
import com.ryuken.dokusho.core.domain.map

class DefaultBookRepository(
    private val remoteBookDataSource: RemoteBookDataSource
): BookRepository {
    override suspend fun searchBooks(query: String): Result<List<Book>, DataError.Remote> {
        return remoteBookDataSource
            .searchBooks(query)
            .map { dto ->
                dto.results.map { it.toBook() }
            }
    }
}