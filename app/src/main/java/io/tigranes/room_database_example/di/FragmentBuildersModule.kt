package io.tigranes.room_database_example.di

import dagger.Module
import dagger.android.ContributesAndroidInjector
import io.tigranes.room_database_example.HomeFragment

@Module
abstract class FragmentBuildersModule {

    @ContributesAndroidInjector
    abstract fun bindSignInFragment(): HomeFragment
}