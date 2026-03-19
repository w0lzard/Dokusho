package com.ryuken.dokusho.book.domain
import com.ryuken.dokusho.core.domain.DataError
import com.ryuken.dokusho.core.domain.Result


interface BookRepository {
    suspend fun searchBooks(query: String): Result<List<Book>, DataError.Remote>
}