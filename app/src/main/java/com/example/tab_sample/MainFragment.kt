package com.example.tab_sample

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainFragment : Fragment() {

    private lateinit var tabCollectionAdapter: TabCollectionAdapter
    private lateinit var viewPager: ViewPager2

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        tabCollectionAdapter = TabCollectionAdapter(this)
        viewPager = view.findViewById(R.id.pager)
        viewPager.adapter = tabCollectionAdapter

        val tabLayout: TabLayout = view.findViewById(R.id.tab_layout)
        tabLayout.tabMode = TabLayout.MODE_SCROLLABLE
        TabLayoutMediator(tabLayout, viewPager) { tab, position ->
            tab.text = "TAB CONTENT ${(position + 1)}"
        }.attach()
    }
}