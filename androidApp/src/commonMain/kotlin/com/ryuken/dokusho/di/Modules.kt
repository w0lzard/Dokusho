package com.ryuken.dokusho.di

import androidx.sqlite.driver.bundled.BundledSQLiteDriver
import com.ryuken.dokusho.book.data.database.DatabaseFactory
import com.ryuken.dokusho.book.data.database.FavoriteBookDatabase
import com.ryuken.dokusho.book.data.network.KtorRemoteBookDataSource
import com.ryuken.dokusho.book.data.network.RemoteBookDataSource
import com.ryuken.dokusho.book.data.repository.DefaultBookRepository
import com.ryuken.dokusho.book.domain.BookRepository
import com.ryuken.dokusho.book.presentation.SelectedBookViewModel
import com.ryuken.dokusho.book.presentation.book_detail.BookDetailViewModel
import com.ryuken.dokusho.book.presentation.book_list.BookListViewModel
import com.ryuken.dokusho.core.data.HttpClientFactory
import org.koin.core.module.Module
import org.koin.core.module.dsl.singleOf
import org.koin.core.module.dsl.viewModelOf
import org.koin.dsl.bind
import org.koin.dsl.module


expect val platformModule: Module

val sharedModule = module {
    single { HttpClientFactory.create(get()) }
    singleOf(::KtorRemoteBookDataSource).bind<RemoteBookDataSource>()
    singleOf(::DefaultBookRepository).bind<BookRepository>()

    single {
        get<DatabaseFactory>().create()
            .setDriver(BundledSQLiteDriver())
            .build()
    }
    single { get<FavoriteBookDatabase>().favoriteBookDao }

    viewModelOf(::BookListViewModel)
    viewModelOf(::BookDetailViewModel)
    viewModelOf(::SelectedBookViewModel)
}