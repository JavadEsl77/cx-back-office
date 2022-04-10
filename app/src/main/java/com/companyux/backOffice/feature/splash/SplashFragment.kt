package com.companyux.backOffice.feature.splash

import android.os.Bundle
import android.os.Handler
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavOptions
import androidx.navigation.fragment.NavHostFragment.Companion.findNavController
import com.companyux.backOffice.R
import com.companyux.backOffice.databinding.FragmentSplashBinding

class SplashFragment : Fragment() {

    lateinit var binding: FragmentSplashBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSplashBinding.inflate(inflater, container, false)


        val handler = Handler()
        handler.postDelayed({

//            findNavController(this)
//                .navigate(R.id.action_splashFragment_to_loginFragment,
//                    null,
//                    NavOptions.Builder()
//                        .setPopUpTo(R.id.splashFragment,
//                            true).build()
//                )

            findNavController(this).navigate(R.id.action_splashFragment_to_loginFragment)
        }, 2000)

        return binding.root
    }

}