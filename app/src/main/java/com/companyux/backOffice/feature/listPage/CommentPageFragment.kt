package com.companyux.backOffice.feature.listPage

import android.R
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.companyux.backOffice.databinding.FragmentCommentPageBinding
import com.companyux.backOffice.databinding.SheetBinding
import com.companyux.backOffice.helper.adapter.CustomBottomSheetDialogFragment
import com.google.android.material.bottomsheet.BottomSheetDialog


class CommentPageFragment : Fragment() {
    private lateinit var fragment: FragmentManager
    private lateinit var binding:FragmentCommentPageBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       binding= FragmentCommentPageBinding.inflate(inflater,container,false)

        fragment = childFragmentManager;
        binding.btnReject.setOnClickListener {

            CustomBottomSheetDialogFragment().apply {
                show(fragment, CustomBottomSheetDialogFragment.TAG)
            }
        }

        return binding.root
    }



}