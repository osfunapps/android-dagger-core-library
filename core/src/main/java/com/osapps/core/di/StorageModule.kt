package com.osapps.core.di

import android.content.Context
import android.content.SharedPreferences
import android.preference.PreferenceManager
import com.osapps.core.infrastructure.localrepository.LocalRepository
import com.osapps.core.infrastructure.localrepository.LocalRepositoryImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class StorageModule {

    @Provides
    @Singleton
    fun providesSharedPreferences(context: Context): SharedPreferences {
        return PreferenceManager.getDefaultSharedPreferences(context)
    }

    @Provides
    @Singleton
    fun provideLocalRepository(sharedPreferences: SharedPreferences): LocalRepository {
        return LocalRepositoryImpl(sharedPreferences)
    }


}