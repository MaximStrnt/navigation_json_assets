package com.example.drawernavanimals.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.drawernavanimals.APP_ACTIVITY
import com.example.drawernavanimals.Animal
import com.example.drawernavanimals.MyAdapter
import com.example.drawernavanimals.databinding.FragmentRedBookBinding


class RedBookFragment : BasicFragment() {

    private lateinit var binding: FragmentRedBookBinding
    private lateinit var RV: RecyclerView
    private lateinit var mAdapter: MyAdapter



    private lateinit var items: ArrayList<Animal>


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentRedBookBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onStart() {
        super.onStart()
        items = ArrayList<Animal>()
        initJSON("ArrayRedBook", items)
        initRV()
    }


    private fun initRV() {
        mAdapter = MyAdapter(APP_ACTIVITY, items)
        RV = binding.rcRedB
        RV.adapter = mAdapter
        RV.setHasFixedSize(true)
    }

}