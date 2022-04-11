package com.companyux.backOffice.feature.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.ActivityNavigator
import androidx.navigation.NavController
import androidx.navigation.NavOptions
import androidx.navigation.fragment.NavHostFragment
import com.companyux.backOffice.R
import com.companyux.backOffice.databinding.FragmentHomeBinding
import com.companyux.backOffice.helper.adapter.MyAdapter
import com.google.android.material.tabs.TabLayout
import io.ak1.BubbleTabBar
import io.ak1.OnBubbleClickListener

class HomeFragment : Fragment() {
    lateinit var binding: FragmentHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(inflater, container, false)

        binding.apply {

            tabLayout.addTab(tabLayout.newTab().setText("لیست نظرات"));
            tabLayout.addTab(tabLayout.newTab().setText("لیست شرکت ها"));
            tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

            val adapter = MyAdapter(requireContext(), childFragmentManager
                ,
                tabLayout.tabCount)
            viewPager.adapter = adapter
            viewPager.addOnPageChangeListener(TabLayout.TabLayoutOnPageChangeListener(tabLayout))
            tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
                override fun onTabSelected(tab: TabLayout.Tab) {
                    viewPager.currentItem = tab.position
                }
                override fun onTabUnselected(tab: TabLayout.Tab) {}
                override fun onTabReselected(tab: TabLayout.Tab) {}
            })
        }

        return binding.root
    }



}