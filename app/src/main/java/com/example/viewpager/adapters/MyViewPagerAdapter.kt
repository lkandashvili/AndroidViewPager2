package com.example.viewpager.adapters

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.viewpager.fragments.DashboardFragment
import com.example.viewpager.fragments.HomeFragment

class MyViewPagerAdapter(activity: AppCompatActivity): FragmentStateAdapter(activity) {
    override fun getItemCount() = 2

    override fun createFragment(position: Int): Fragment {
        return if (position == 0) {
            HomeFragment().apply {
                arguments = Bundle().apply {
                    putString("TEXT", "My home")
                }
            }
        }else {
            DashboardFragment()
        }
    }

}