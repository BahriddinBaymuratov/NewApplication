package com.example.newapplication.activity.manager

import android.content.Context
import android.content.SharedPreferences

class SharedPref(context: Context){

    private val sharedPreferences: SharedPreferences =
        context.getSharedPreferences("My_Pref", Context.MODE_PRIVATE)

    fun saveFinish(isFinish: Boolean){
        val edit = sharedPreferences.edit()
        edit.putBoolean("isFinish", isFinish)
        edit.apply()
    }

    fun getFinish(): Boolean{
        return sharedPreferences.getBoolean("isFinish", false)
    }


}