package com.companyux.backOffice.helper.adapter

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.companyux.backOffice.feature.listPage.CommentPageFragment
import com.companyux.backOffice.feature.office.OfficePageFragment

@Suppress("DEPRECATION")
internal class MyAdapter(
    var context: Context,
    fm: FragmentManager,
    var totalTabs: Int
) :
    FragmentPagerAdapter(fm) {
    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> {
                CommentPageFragment()

            }
            1 -> {
                OfficePageFragment()

            }

            else -> getItem(position)
        }
    }
    override fun getCount(): Int {
        return totalTabs
    }
}