package com.companyux.backOffice.helper.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.companyux.backOffice.feature.listPage.CommentPageFragment
import com.companyux.backOffice.feature.office.OfficePageFragment

@Suppress("DEPRECATION")
internal class MyAdapter(
    fm: FragmentManager,
    lifecycle: Lifecycle,
) : FragmentStateAdapter(fm, lifecycle) {
    override fun getItemCount(): Int = 2

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> CommentPageFragment()
            1 -> OfficePageFragment()
            else -> OfficePageFragment()
        }
    }
}