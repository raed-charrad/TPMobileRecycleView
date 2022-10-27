package com.example.recycleview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var recycler : RecyclerView
    private val dataList = ArrayList<String>()
    private lateinit var adapter: CustomAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        for (i in 0..20)
            dataList.add("item$i")
        recycler = findViewById(R.id.recyclerView)
        adapter = CustomAdapter(dataList)
        val layoutRecycler = LinearLayoutManager(applicationContext)
        recycler.layoutManager = layoutRecycler
        recycler.adapter = adapter

    }
}