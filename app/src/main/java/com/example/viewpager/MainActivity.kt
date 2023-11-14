package com.example.viewpager

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TableLayout
import androidx.viewpager2.widget.ViewPager2
import com.example.viewpager.adapters.MyViewPagerAdapter
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {

    private lateinit var viewPager2: ViewPager2
    private lateinit var tablayout: TabLayout

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewPager2 = findViewById(R.id.viewPager)
        tablayout = findViewById(R.id.tabLayout)

        val myViewPagerAdapter = MyViewPagerAdapter(this)

        viewPager2.adapter = myViewPagerAdapter

        TabLayoutMediator(tablayout, viewPager2) { tab, position ->
            if (position == 0) {
                tab.text = "Home"
            } else {
                tab.text = "Dashboard"
            }
        }.attach()

    }
}