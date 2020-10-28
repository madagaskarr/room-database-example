package io.tigranes.room_database_example.di

import android.app.Application
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import io.tigranes.room_database_example.MyApplication
import javax.inject.Singleton

@Singleton
@Component(modules = [
    AndroidInjectionModule::class,
    ActivityBuildersModule::class,
    ApplicationModule::class
])
interface ApplicationGraph: AndroidInjector<MyApplication> {

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun application(application: Application): Builder

        fun build(): ApplicationGraph
    }

    override fun inject(instance: MyApplication)
}