package com.firmanarivianto.viewpagetablayout

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter

class MyPagerAdapter(fm: FragmentManager): FragmentPagerAdapter(fm) {

    // sebuah list yang menampung objek Fragment
    private val pages = listOf(
        FirstFragment(),
        SecondFragment(),
        ThridFragment(),
        FourFragment()
    )

    // menentukan fragment yang akan dibuka pada posisi tertentu
    override fun getItem(position: Int): Fragment {
        return pages[position]
    }

    override fun getCount(): Int {
        return pages.size
    }

    // judul untuk tabs
    override fun getPageTitle(position: Int): CharSequence? {
        return when (position) {
            0 -> "Perkenalan"
            1 -> "Kontak"
            2 -> "Biodata"
            else -> "My Friends"
        }
    }
}