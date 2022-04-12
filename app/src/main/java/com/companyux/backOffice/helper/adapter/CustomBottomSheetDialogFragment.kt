package com.companyux.backOffice.helper.adapter

import android.content.DialogInterface
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.companyux.backOffice.R
import com.companyux.backOffice.databinding.SheetBinding
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class CustomBottomSheetDialogFragment: BottomSheetDialogFragment() {

    lateinit var binding_sheet:SheetBinding
    companion object {
        const val TAG = "CustomBottomSheetDialogFragment"
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding_sheet= SheetBinding.inflate(inflater,container,false)
        return binding_sheet.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        binding_sheet.btnYes.setOnClickListener {

        }
        binding_sheet.btnNo.setOnClickListener {
            dismiss()

        }


    }

    override fun dismiss() {
        super.dismiss()
    }
}