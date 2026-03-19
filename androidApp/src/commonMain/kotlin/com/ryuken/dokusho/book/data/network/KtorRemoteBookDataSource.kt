package com.ryuken.dokusho.book.data.network

import androidx.room.Query
import com.ryuken.dokusho.book.data.dto.SearchResponseDto
import com.ryuken.dokusho.book.domain.Book
import com.ryuken.dokusho.core.data.safeCall
import io.ktor.client.HttpClient
import com.ryuken.dokusho.core.domain.DataError
import io.ktor.client.request.get
import io.ktor.client.request.parameter

private const val BASE_URL = "https://openlibrary.org"
class KtorRemoteBookDataSource(
    private val httpClient: HttpClient
): RemoteBookDataSource {
    override suspend fun searchBooks(
        query: String,
        resultLimit: Int?
    ): Result<SearchResponseDto, DataError.Remote> {
        return safeCall {
            httpClient.get(
                urlString = "$BASE_URL/search.json"
            ){
                parameter("q", query)
                parameter("limit", resultLimit)
                parameter("language", "eng")
                parameter("fields", "key,title,language,cover_i,author_key,author_name,cover_edition_key,first_publish_year,ratings_average,ratings_count,number_of_pages_median,edition_count")
            }
        }

    }
}