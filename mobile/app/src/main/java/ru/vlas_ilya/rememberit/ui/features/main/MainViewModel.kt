package ru.vlas_ilya.rememberit.ui.features.main

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    var name = mutableStateOf("Android")
        private set

    fun setName(name: String) {
        this.name.value = name;
    }
}