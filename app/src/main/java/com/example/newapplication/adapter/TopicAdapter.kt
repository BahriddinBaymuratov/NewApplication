package com.example.newapplication.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.core.graphics.toColorInt
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.newapplication.R
import com.example.newapplication.databinding.TopicLayoutBinding

class TopicAdapter: ListAdapter<String, TopicAdapter.TopicViewHolder>(DiffCallBack()){
    private val topicList: MutableList<String> = ArrayList()
    private lateinit var context: Context
    private class DiffCallBack: DiffUtil.ItemCallback<String>(){
        override fun areItemsTheSame(oldItem: String, newItem: String): Boolean {
            return oldItem.contentEquals(newItem)
        }

        override fun areContentsTheSame(oldItem: String, newItem: String): Boolean {
            return oldItem == newItem
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TopicViewHolder {
        context = parent.context
        return TopicViewHolder(
            TopicLayoutBinding.inflate(LayoutInflater.from(parent.context),
            parent,false)
        )
    }

    override fun onBindViewHolder(holder: TopicViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    inner class TopicViewHolder(private val binding: TopicLayoutBinding): RecyclerView.ViewHolder(binding.root){
        fun bind(text: String){
            binding.textView.text = text
            itemView.setOnClickListener {
                if (!topicList.contains(text)){
                    binding.textView.setTextColor(ContextCompat.getColor(context, R.color.white))
                    binding.cardView.setCardBackgroundColor(ContextCompat.getColor(context, R.color.blue))
                    topicList.add(text)
                }else{
                    binding.textView.setTextColor(ContextCompat.getColor(context, R.color.blue))
                    binding.cardView.setCardBackgroundColor(ContextCompat.getColor(context, R.color.gray_light))
                    topicList.remove(text)
                }
            }
        }
    }

}