package com.companyux.backOffice.feature.listPage

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.companyux.backOffice.R
import com.companyux.backOffice.databinding.FragmentCommentPageBinding

class CommentPageFragment : Fragment() {

    lateinit var binding:FragmentCommentPageBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       binding= FragmentCommentPageBinding.inflate(inflater,container,false)
        return binding.root
    }

}