package com.example.viewpager.fragments

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.viewpager.R

class HomeFragment: Fragment(R.layout.fragment_home) {

    private lateinit var textView: TextView

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        textView = view.findViewById(R.id.textView)

        textView.text = arguments?.getString("TEXT")

    }
}