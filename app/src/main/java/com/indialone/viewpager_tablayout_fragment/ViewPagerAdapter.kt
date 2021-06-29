package com.indialone.viewpager_tablayout_fragment

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.indialone.viewpager_tablayout_fragment.model.TabTitle

class ViewPagerAdapter(fragmentManager: FragmentManager) : FragmentPagerAdapter(fragmentManager) {

    private val fragments: ArrayList<Fragment> = ArrayList()
    private val fragmentTitles: ArrayList<String> = ArrayList()

    //if you want title+icons in tab layout then uncomment the line in add function and add title: String in function parameters
    fun add(fragment: Fragment) {
        fragments.add(fragment)
//        fragmentTitles.add(title)
    }

    override fun getCount(): Int {
        return fragments.size
    }

    override fun getItem(position: Int): Fragment {
        return fragments.get(position)
    }

/*
    // if you want icon+title in tab layout then you uncomment below code
    override fun getPageTitle(position: Int): CharSequence {
        return fragmentTitles.get(position)
    }

    */

}
