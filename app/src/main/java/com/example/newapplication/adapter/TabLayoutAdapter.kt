package com.example.newapplication.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.newapplication.databinding.HorLayoutBinding
import com.example.newapplication.model.NewsImage

class TabLayoutAdapter :
    ListAdapter<NewsImage, TabLayoutAdapter.TabViewHolder>(DiffCallBack()) {
    lateinit var onClick: (NewsImage) -> Unit

    private class DiffCallBack : DiffUtil.ItemCallback<NewsImage>() {
        override fun areItemsTheSame(oldItem: NewsImage, newItem: NewsImage): Boolean {
            return oldItem.title == newItem.title
        }

        override fun areContentsTheSame(oldItem: NewsImage, newItem: NewsImage): Boolean {
            return oldItem == newItem
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TabViewHolder {
        return TabViewHolder(
            HorLayoutBinding.inflate(LayoutInflater.from(parent.context),
            parent,false)
        )
    }

    override fun onBindViewHolder(holder: TabViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    inner class TabViewHolder(private val binding: HorLayoutBinding):RecyclerView.ViewHolder(binding.root){
        fun bind(newItem: NewsImage){
            binding.apply {
                textTitle.text = newItem.title
                textDesc.text = newItem.desc
                imageView.setImageResource(newItem.backImage)
            }
            itemView.setOnClickListener {
                onClick(newItem)
            }
        }
    }

}