package com.example.recycleview
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

internal class CustomAdapter (private var data :List<String>): RecyclerView.Adapter<CustomAdapter.MyViewHolder>() {
    internal inner class MyViewHolder (view : View) : RecyclerView.ViewHolder(view) {
        var item : TextView = view.findViewById(R.id.textView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.line,parent,false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val item = data[position]
        holder.item.text = item
    }

    override fun getItemCount(): Int {
        return data.size
    }
}