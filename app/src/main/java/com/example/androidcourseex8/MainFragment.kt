package com.example.androidcourseex8

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController


class MainFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val bF1 = view.findViewById<Button>(R.id.buttonF1)
        val bF2 = view.findViewById<Button>(R.id.buttonF2)
        val controller = findNavController()
        bF1.setOnClickListener { controller.navigate(R.id.action_mainFragment_to_page1Fragment) }
        bF2.setOnClickListener { controller.navigate(R.id.action_mainFragment_to_page2Fragment) }
    }

}