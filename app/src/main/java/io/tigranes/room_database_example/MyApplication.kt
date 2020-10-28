package io.tigranes.room_database_example

import dagger.android.AndroidInjector
import dagger.android.DaggerApplication
import io.tigranes.room_database_example.di.DaggerApplicationGraph

class MyApplication: DaggerApplication() {
    
    override fun applicationInjector(): AndroidInjector<out DaggerApplication> = DaggerApplicationGraph.builder().application(this).build()
}