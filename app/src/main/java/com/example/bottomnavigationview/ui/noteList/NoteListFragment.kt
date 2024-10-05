package com.example.bottomnavigationview.ui.noteList

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.example.bottomnavigationview.databinding.FragmentNoteListBinding

class NoteListFragment : Fragment() {

    private var _binding: FragmentNoteListBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val noteListViewModel = ViewModelProvider(this)[NoteListViewModel::class.java]
        _binding = FragmentNoteListBinding.inflate(inflater, container, false)
        val textView = binding.textView
        noteListViewModel.text.observe(viewLifecycleOwner){
            textView.text = it
        }
        return binding.root
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

}