package com.example.bottomnavigationview.ui.noteList

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class NoteListViewModel: ViewModel() {
    private val _text = MutableLiveData<String>().apply {
        value = "NoteList fragment"
    }
    val text: LiveData<String> = _text
}