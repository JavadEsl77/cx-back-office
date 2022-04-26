package com.companyux.backOffice.feature.home

import android.annotation.SuppressLint
import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import androidx.fragment.app.Fragment
import com.companyux.backOffice.R
import com.companyux.backOffice.databinding.FragmentHomeBinding
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.google.android.material.button.MaterialButton


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
                addUrlSheet(requireContext())
            }

        }
    }

    @SuppressLint("InflateParams")
    private fun addUrlSheet(context: Context){
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