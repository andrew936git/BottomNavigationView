package com.example.bottomnavigationview.ui.note

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.example.bottomnavigationview.R
import com.example.bottomnavigationview.databinding.FragmentHomeBinding
import com.example.bottomnavigationview.databinding.FragmentNoteBinding
import com.example.bottomnavigationview.ui.home.HomeViewModel


class NoteFragment : Fragment() {

    private var _binding: FragmentNoteBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val noteViewModel = ViewModelProvider(this)[NoteViewModel::class.java]
        _binding = FragmentNoteBinding.inflate(inflater, container, false)
        val textView = binding.textView
        noteViewModel.text.observe(viewLifecycleOwner){
            textView.text = it
        }
        return binding.root
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

}