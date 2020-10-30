package io.tigranes.room_database_example

import androidx.lifecycle.ViewModel
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class HomeViewModel @Inject constructor(): ViewModel() {

    var getName = "Tigran Ghazinyan"

}