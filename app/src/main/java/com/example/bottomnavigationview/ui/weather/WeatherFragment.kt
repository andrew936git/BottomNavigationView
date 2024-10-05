package com.example.bottomnavigationview.ui.weather

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.example.bottomnavigationview.R
import com.example.bottomnavigationview.databinding.FragmentNoteListBinding
import com.example.bottomnavigationview.databinding.FragmentWeatherBinding
import com.example.bottomnavigationview.ui.noteList.NoteListViewModel

class WeatherFragment : Fragment() {
    private var _binding: FragmentWeatherBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val weatherViewModel = ViewModelProvider(this)[WeatherViewModel::class.java]
        _binding = FragmentWeatherBinding.inflate(inflater, container, false)
        val textView = binding.textView
        weatherViewModel.text.observe(viewLifecycleOwner){
            textView.text = it
        }
        return binding.root
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

}