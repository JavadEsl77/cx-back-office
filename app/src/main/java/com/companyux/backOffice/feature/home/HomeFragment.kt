package com.companyux.backOffice.feature.home

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import android.widget.Toast
import androidx.navigation.ActivityNavigator
import androidx.navigation.NavController
import androidx.navigation.NavOptions
import androidx.navigation.fragment.NavHostFragment
import androidx.viewpager2.widget.ViewPager2
import com.companyux.backOffice.R
import com.companyux.backOffice.databinding.FragmentHomeBinding
import com.companyux.backOffice.helper.adapter.MyAdapter
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.google.android.material.button.MaterialButton
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import io.ak1.BubbleTabBar
import io.ak1.OnBubbleClickListener
import kotlinx.coroutines.currentCoroutineContext


class HomeFragment : Fragment(R.layout.fragment_home) {

    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.apply {

//            tabLayout.tabGravity = TabLayout.GRAVITY_FILL
//
//            val adapter = MyAdapter(childFragmentManager, lifecycle)
//            viewPager.adapter = adapter
//
//            TabLayoutMediator(tabLayout, viewPager) { tab, position ->
//                val name = when (position) {
//                    0 -> "لیست نظرات"
//                    1 -> "لیست شرکت ها"
//                    else -> ""
//                }
//                tab.text = name
//            }.attach()

            fbAddUrl.setOnClickListener {
                AddUrlButtomSheet(requireContext())
            }


        }
    }

    private fun AddUrlButtomSheet(context:Context){
        val dialog = BottomSheetDialog(context)
        val view = layoutInflater.inflate(R.layout.bottom_sheet_dialog, null)
        val btnClose = view.findViewById<ImageButton>(R.id.idBtnDismiss)
        val btnSetLink = view.findViewById<MaterialButton>(R.id.btn_set_link)

        btnClose.setOnClickListener {
            dialog.dismiss()
        }

        btnSetLink.setOnClickListener {
            dialog.dismiss()
        }

        dialog.setCancelable(false)
        dialog.setContentView(view)
        dialog.show()
    }

}