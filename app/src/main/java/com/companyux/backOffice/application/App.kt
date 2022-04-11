package com.companyux.backOffice.application

import android.R
import androidx.multidex.MultiDexApplication



class App : MultiDexApplication() {

    override fun onCreate() {
        super.onCreate()
//        CalligraphyConfig.initDefault(
//            CalligraphyConfig.Builder()
//                .setDefaultFontPath("fonts/Roboto-RobotoRegular.ttf")
//                .setFontAttrId(R.attr.fontPath)
//                .build()
//        )
    }
}