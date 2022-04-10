package com.companyux.backOffice.feature.login

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.NavHostFragment
import com.companyux.backOffice.R
import com.companyux.backOffice.databinding.FragmentLoginBinding

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

        binding.apply {
            binding.btnLogin.setOnClickListener {
                NavHostFragment.findNavController(requireParentFragment()).navigate(R.id.action_loginFragment_to_homeFragment)
            }
        }

        return binding.root
    }

}