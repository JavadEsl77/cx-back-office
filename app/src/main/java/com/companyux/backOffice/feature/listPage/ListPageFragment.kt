package com.companyux.backOffice.feature.listPage

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.companyux.backOffice.R
import com.companyux.backOffice.databinding.FragmentListPageBinding

class ListPageFragment : Fragment() {

    lateinit var binding:FragmentListPageBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       binding= FragmentListPageBinding.inflate(inflater,container,false)
        return binding.root
    }

}