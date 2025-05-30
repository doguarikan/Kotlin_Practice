package com.example.subject_four

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.subject_four.databinding.FragmentMainPageBinding


class MainPageFragment : Fragment() {
    private lateinit var binding: FragmentMainPageBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMainPageBinding.inflate(inflater, container, false)
        binding.buttonToA.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.maintoa)
        }
        binding.buttonToX.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.maintox)
        }
        return binding.root
    }
}