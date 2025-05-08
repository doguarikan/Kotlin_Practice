package com.example.subject_four

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.subject_four.databinding.FragmentABinding
import com.example.subject_four.databinding.FragmentMainPageBinding

class AFragment : Fragment() {
    private lateinit var binding: FragmentABinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentABinding.inflate(inflater, container, false)
        binding.buttonToB.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.atob)
        }
        return binding.root
    }
}