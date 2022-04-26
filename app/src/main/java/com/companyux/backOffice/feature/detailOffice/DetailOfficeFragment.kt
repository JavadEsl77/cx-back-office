package com.companyux.backOffice.feature.detailOffice

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import com.companyux.backOffice.R
import com.companyux.backOffice.databinding.FragmentDetailOfficeBinding

class DetailOfficeFragment : Fragment() {
    private lateinit var binding:FragmentDetailOfficeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentDetailOfficeBinding.inflate(inflater,container,false)
        binding.apply {
            binding.inclToolbarDetail.imbClose.setOnClickListener {
                findNavController().popBackStack()
            }

        }
        return binding.root
    }

}