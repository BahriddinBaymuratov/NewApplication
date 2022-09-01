package com.example.newapplication.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.AppCompatImageView
import androidx.appcompat.widget.AppCompatTextView
import com.example.newapplication.R
import com.example.newapplication.model.NewsImage


class DetailFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_detail, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initViews(view)
    }
    private fun initViews(view: View){
        val imageView: AppCompatImageView = view.findViewById(R.id.imageView)
        val title: AppCompatTextView = view.findViewById(R.id.textView)
        val desc: AppCompatTextView = view.findViewById(R.id.textDesc)
        val newImage = arguments?.getParcelable<NewsImage>("news")
        newImage?.let { image ->
            imageView.setImageResource(image.backImage)
            title.text = image.title
            desc.text = image.desc

        }
    }
}