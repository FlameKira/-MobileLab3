package com.example.myapplication

import androidx.lifecycle.ViewModel

class CharacterViewModel : ViewModel() {
    val characters = mutableStateListOf<Character>()

    fun fetchCharacters() {
        viewModelScope.launch {
            characters.addAll(ApiService.api.getCharacters())
        }
    }
}
