package io.tigranes.room_database_example.di

import androidx.lifecycle.ViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import io.tigranes.room_database_example.HomeViewModel
import javax.inject.Singleton

@Module
abstract class ViewModelModule {

    @Singleton
    @Binds
    @IntoMap
    @ViewModelKey(HomeViewModel::class)
    abstract fun bindSignInViewModel(authViewModel: HomeViewModel): ViewModel
}