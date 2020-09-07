package com.example.viewmodeldemo

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel(startingTotal: Int) : ViewModel() {
    var counter = MutableLiveData<Int>().apply {
        5
    }

    init {
        counter.value = 43
    }

    fun addValue() {
        counter.value = counter.value?.inc()
    }
}