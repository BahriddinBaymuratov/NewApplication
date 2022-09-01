package com.example.newapplication.fragment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import com.example.newapplication.R
import com.example.newapplication.activity.HomeActivity
import com.example.newapplication.activity.MainActivity
import com.example.newapplication.activity.manager.SharedPref
import com.example.newapplication.adapter.TopicAdapter
import com.example.newapplication.databinding.FragmentThirdBinding
import com.example.newapplication.util.ObjectList

class ThirdFragment : Fragment() {

    private var _binding: FragmentThirdBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentThirdBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initViews()
    }

    private fun initViews() {
        val sharedPref = SharedPref(requireContext())
        val topicAdapter = TopicAdapter()
        topicAdapter.submitList(ObjectList.topicList())
        binding.recyclerView.layoutManager = GridLayoutManager(requireContext(), 2)
        binding.recyclerView.adapter = topicAdapter
        binding.btnNext.setOnClickListener {
            val activity = (activity as MainActivity)
            activity.startActivity(Intent(activity, HomeActivity::class.java))
            activity.finish()
            sharedPref.saveFinish(true)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}