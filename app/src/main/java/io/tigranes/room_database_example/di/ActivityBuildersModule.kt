package io.tigranes.room_database_example.di

import dagger.Module
import dagger.android.ContributesAndroidInjector
import io.tigranes.room_database_example.MainActivity

@Module
abstract class ActivityBuildersModule {

    @ContributesAndroidInjector
    abstract fun bindMainActivity(): MainActivity
}