package com.ryuken.dokusho.book.data.mappers

import com.ryuken.dokusho.book.data.dto.SearchedBookDto
import com.ryuken.dokusho.book.domain.Book

fun SearchedBookDto.toBook(): Book{
    return Book(
        id = id,
        title = title,
        authors = authorNames ?: emptyList(),
        description = null,
        languages = languages ?: emptyList(),
        imageUrl = if (coverKey!=null){"https://covers.openlibrary.org/b/olid/${coverKey}-L.jpg"}
        else{"https://covers.openlibrary.org/b/id/${coverAlternativeKey}-L.jpg"},
        firstPublishYear = firstPublishYear.toString(),
        averageRating = ratingsAverage,
        ratingCount = ratingsCount,
        numPages = numPagesMedian,
        numEditions = numEditions ?: 0
    )
}
