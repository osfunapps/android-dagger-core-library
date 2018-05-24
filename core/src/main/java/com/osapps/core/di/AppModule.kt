package com.osapps.core.di

import android.content.Context
import dagger.Module
import dagger.Provides
import dagger.Reusable
import javax.inject.Singleton

@Module
class AppModule(private val context: Context) {
    @Provides
    @Singleton
    fun providesContext(): Context {
        return context
    }
}