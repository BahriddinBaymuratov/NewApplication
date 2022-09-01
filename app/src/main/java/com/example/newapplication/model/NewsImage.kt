package com.example.newapplication.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class NewsImage(
    val title: String,
    val desc: String,
    val backImage: Int
): Parcelable
