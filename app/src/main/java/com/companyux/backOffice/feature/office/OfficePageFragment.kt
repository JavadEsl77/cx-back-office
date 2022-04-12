package com.companyux.backOffice.feature.office

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.NavHostFragment
import com.companyux.backOffice.R
import com.companyux.backOffice.databinding.FragmentOfficePageBinding

class OfficePageFragment : Fragment() {
    lateinit var binding: FragmentOfficePageBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentOfficePageBinding.inflate(inflater, container, false)
        binding.apply {
            lyOfficeItemTest.setOnClickListener {

                NavHostFragment.findNavController(requireParentFragment())
                    .navigate(R.id.action_homeFragment_to_detailOfficeFragment)

            }
        }
        return binding.root
    }
}