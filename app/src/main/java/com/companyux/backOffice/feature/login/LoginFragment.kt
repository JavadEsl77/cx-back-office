package com.companyux.backOffice.feature.login

import android.content.SharedPreferences
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.NavHostFragment
import com.companyux.backOffice.R
import com.companyux.backOffice.databinding.FragmentLoginBinding
import com.companyux.backOffice.feature.MainActivity.Companion.sharedPreferences

class LoginFragment : Fragment() {

    lateinit var binding: FragmentLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentLoginBinding.inflate(inflater, container, false)

        val editor:SharedPreferences.Editor =  sharedPreferences.edit()
        binding.apply {
            binding.btnLogin.setOnClickListener {
                val passwordEdt = edtCellNumber.text.toString()
                if (passwordEdt == "14010121") {
                    NavHostFragment.findNavController(requireParentFragment())
                        .navigate(R.id.action_loginFragment_to_homeFragment)

                    editor.putString("password_sh","14010121")
                    editor.putBoolean("state",true)
                    editor.apply()

                } else if (passwordEdt == "") {
                    edtCellNumber.error = "رمز را وارد کنید ):"
                } else {
                    edtCellNumber.error = "رمز اشتباه است"
                }
            }


        }

        return binding.root
    }

}