package com.companyux.backOffice.feature

import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContentProviderCompat.requireContext
import com.companyux.backOffice.R

class MainActivity : AppCompatActivity() {

    companion object{
        lateinit var sharedPreferences: SharedPreferences
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        sharedPreferences= this.getSharedPreferences("login_state",0)
    }
}