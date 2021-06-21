package com.example.shoeapp

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class PageAdapter(fm: FragmentManager) :FragmentPagerAdapter(fm) {
    override fun getCount(): Int {
        return 3

    }

    override fun getItem(position: Int): Fragment {
     when(position) {
         0 -> {return FragmentA()}
         1 -> {return FragmentB()}
         2 -> {return FragmentC()}
         3 -> {return FragmentD()}

         else -> {return FragmentA()}
     }

    }

    override fun getPageTitle(position: Int): CharSequence? {
        when (position){
            0 -> {return "Tab 1"}
            1 -> {return "Tab 2"}
            2 -> {return "Tab 3"}
            3 -> {return "Tab 4"}

        }

        return super.getPageTitle(position)
    }
}