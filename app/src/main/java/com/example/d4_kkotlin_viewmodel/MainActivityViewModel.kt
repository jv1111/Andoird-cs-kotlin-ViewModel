package com.example.d4_kkotlin_viewmodel

import androidx.lifecycle.ViewModel

class MainActivityViewModel : ViewModel() {
    var count = 0

    fun updateCount(){
        count++
    }

}