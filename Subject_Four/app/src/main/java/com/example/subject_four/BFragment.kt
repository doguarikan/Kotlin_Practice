package com.example.subject_four

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.subject_four.databinding.FragmentABinding
import com.example.subject_four.databinding.FragmentBBinding
import com.example.subject_four.databinding.FragmentMainPageBinding

class BFragment : Fragment() {
    private lateinit var binding: FragmentBBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentBBinding.inflate(inflater, container, false)
        binding.buttonToY.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.btoy)
        }
        return binding.root
    }
}