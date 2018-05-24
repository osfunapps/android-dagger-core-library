package com.osapps.core.di

import android.content.Context
import com.osapps.core.infrastructure.localrepository.LocalRepository
import dagger.Component
import dagger.Reusable
import javax.inject.Singleton

@Singleton
@Component(modules = [AppModule::class, StorageModule::class])
interface CoreComponent {
    fun localRepository(): LocalRepository
}