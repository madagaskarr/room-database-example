package io.tigranes.room_database_example.di

import android.app.Application
import android.content.Context
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
object ApplicationModule {

    @Singleton
    @Provides
    fun provideApplicationContext(context: Application): Context = context

    @Singleton
    @Provides
    fun provideName() = "Tigran Ghazinyan"
}