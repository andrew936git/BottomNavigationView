package com.example.bottomnavigationview.ui.weather

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class WeatherViewModel: ViewModel() {
    private val _text = MutableLiveData<String>().apply {
        value = "Weather fragment"
    }
    val text: LiveData<String> = _text
}