package com.companyux.backOffice.feature.detailOffice

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.NavHostFragment
import com.companyux.backOffice.R
import com.companyux.backOffice.databinding.FragmentDetailOfficeBinding

class DetailOfficeFragment : Fragment() {
    lateinit var binding:FragmentDetailOfficeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentDetailOfficeBinding.inflate(inflater,container,false)
        binding.apply {
            binding.inclToolbarDetail.imbClose.setOnClickListener {
                NavHostFragment.findNavController(requireParentFragment()).navigate(R.id.action_detailOfficeFragment_to_homeFragment)
            }

        }
        return binding.root
    }

}