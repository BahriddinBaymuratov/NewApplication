package com.example.newapplication.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.newapplication.databinding.VerLayoutBinding
import com.example.newapplication.model.VerImage

class VerAdapter:
        ListAdapter<VerImage, VerAdapter.VerViewHolder>(DiffCallBack()){
            private class DiffCallBack: DiffUtil.ItemCallback<VerImage>(){
                override fun areItemsTheSame(oldItem: VerImage, newItem: VerImage): Boolean {
                    return oldItem.title == newItem.title
                }

                override fun areContentsTheSame(oldItem: VerImage, newItem: VerImage): Boolean {
                    return oldItem == newItem
                }
            }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VerViewHolder {
        return VerViewHolder(
            VerLayoutBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,false
            )
        )
    }

    override fun onBindViewHolder(holder: VerViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    inner class VerViewHolder(private val binding: VerLayoutBinding): RecyclerView.ViewHolder(binding.root){
        fun bind(image: VerImage){
            binding.apply {
                imageView.setImageResource(image.backImage)
                textTitle.text = image.title
                textDesc.text = image.desc
            }
        }
    }
        }