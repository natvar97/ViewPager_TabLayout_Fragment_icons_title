package com.indialone.viewpager_tablayout_fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {

    private lateinit var viewPager: ViewPager
    private lateinit var tabLayout: TabLayout
    private lateinit var viewPagerAdapter: ViewPagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // initialize viewPager and tabLayout
        init()

        //setting up the viewpager with view pager adapter
        setUpViewPagerWithAdapter()

        //setting up tab layout
        setUpTabLayout()

    }

    private fun setUpTabLayout() {
        tabLayout.setupWithViewPager(viewPager)
        setUpTabIcons()
    }

    private fun setUpTabIcons() {
        tabLayout.getTabAt(0)!!.icon = resources.getDrawable(R.drawable.baseline_home_white_24)
        tabLayout.getTabAt(1)!!.icon = resources.getDrawable(R.drawable.baseline_mail_white_24)
        tabLayout.getTabAt(2)!!.icon =
            resources.getDrawable(R.drawable.baseline_notifications_none_white_24)
        tabLayout.getTabAt(3)!!.icon = resources.getDrawable(R.drawable.baseline_settings_white_24)
    }

    private fun setUpViewPagerWithAdapter() {
        viewPagerAdapter = ViewPagerAdapter(supportFragmentManager)

//        * if you only want icons in tab layout then you uncomment below code

        viewPagerAdapter.add(HomeFragment())
        viewPagerAdapter.add(MailFragment())
        viewPagerAdapter.add(NotificationFragment())
        viewPagerAdapter.add(SettingsFragment())


/*
        // if you want both icon+title in tab layout then you can uncomment below code

            viewPagerAdapter.add(HomeFragment() , "Home")
            viewPagerAdapter.add(MailFragment() , "Mail")
            viewPagerAdapter.add(NotificationFragment() , "Notifications")
            viewPagerAdapter.add(SettingsFragment() , "Settings")
*/


        viewPager.adapter = viewPagerAdapter
    }

    fun init() {
        viewPager = findViewById(R.id.view_pager)
        tabLayout = findViewById(R.id.tool_bar)
    }
}