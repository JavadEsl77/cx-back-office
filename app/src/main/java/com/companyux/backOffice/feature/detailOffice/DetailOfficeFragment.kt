package com.companyux.backOffice.feature.detailOffice

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
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
        // Inflate the layout for this fragment
        return binding.root
    }

}