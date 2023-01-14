package com.example.tab_sample

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter

class TabCollectionAdapter(fragment: Fragment) : FragmentStateAdapter(fragment) {

    override fun getItemCount(): Int = 4

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> TabContent1Fragment()
            1 -> TabContent2Fragment()
            2 -> TabContent3Fragment()
            3 -> TabContent4Fragment()
            else -> TabContent1Fragment()
        }
    }
}