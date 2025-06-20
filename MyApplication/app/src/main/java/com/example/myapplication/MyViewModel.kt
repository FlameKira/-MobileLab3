package com.example.myapplication

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel

class MyViewModel : ViewModel() {
    private val _data = MutableLiveData<MyData>()
    val data: LiveData<MyData> get() = _data

    fun fetchData() {
        viewModelScope.launch {
            try {
                val result = fetchFromApi() // Ваша функция для получения данных
                _data.postValue(result)
            } catch (e: Exception) {
                // Обработка ошибок
            }
        }
    }
}
