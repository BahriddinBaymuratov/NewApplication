package com.example.newapplication.util

import com.example.newapplication.R
import com.example.newapplication.model.NewsImage
import com.example.newapplication.model.VerImage

object ObjectList {
    val arr = mutableListOf(
        "Sports",
        "Politics",
        "Life",
        "Gaming",
        "Animals",
        "Nature",
        "Food",
        "Art",
        "History",
        "Fashion",
        "Covid 19",
        "Middle East"
    )
    fun imageList(): List<Int> {
        return listOf(
            R.drawable.img2,
            R.drawable.img1,
            R.drawable.img3,
        )
    }

    fun topicList(): List<String> {
        return listOf(
            "\uD83C\uDFC8   Sports",
            "⚖️   Politics",
            "\uD83C\uDF1E   Life",
            "\uD83C\uDFAE   Gaming",
            "\uD83D\uDC3B   Animals",
            "\uD83C\uDF34   Nature",
            "\uD83C\uDF54   Food",
            "\uD83C\uDFA8   Art",
            "\uD83D\uDCDC   History",
            "\uD83D\uDC57   Fashion",
        )
    }
    fun newsImagesList(): MutableList<NewsImage> {
        return mutableListOf(
            NewsImage("Politics","The latest situation in the presidential election", R.drawable.img1),
            NewsImage("Sport","The latest situation in the presidential election", R.drawable.img2),
            NewsImage("Art","An updated daily front page", R.drawable.img3),
        )
    }
    fun verImageList(): List<VerImage> {
        return listOf(
            VerImage(
                title = "UI/UX Design",
                desc = "A Simple Trick For Creating Color Palettes Quickly",
                backImage = R.drawable.img1
            ),
            VerImage(
                title = "UI/UX Design",
                desc = "A Simple Trick For Creating Color Palettes Quickly",
                backImage = R.drawable.img1
            ),
            VerImage(
                title = "UI/UX Design",
                desc = "A Simple Trick For Creating Color Palettes Quickly",
                backImage = R.drawable.img1
            )
        )
    }
}