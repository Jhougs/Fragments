package com.juanviana.otherexample.ui.main

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.juanviana.otherexample.*
import com.juanviana.otherexample.ui.RadioFragment

private val TAB_TITLES = arrayOf(
    R.string.title_Batman,
    R.string.title_Flash,
    R.string.title_superman,
    R.string.title_Wonder_woman,
    R.string.title_radio
)

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
class SectionsPagerAdapter(private val context: Context, fm: FragmentManager) :
    FragmentPagerAdapter(fm) {

    override fun getItem(position: Int): Fragment {
       when (position){
           0 -> return BatmanFragment()
           1 -> return FlashFragment()
           2 -> return SupermanFragment()
           3 -> return RadioFragment()

           else -> return  WonderWomanFragment()
       }
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return context.resources.getString(TAB_TITLES[position])
    }

    override fun getCount(): Int {
        // Show 2 total pages.
        return 4
    }
}