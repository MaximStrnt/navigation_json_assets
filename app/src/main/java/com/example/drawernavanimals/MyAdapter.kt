package com.example.drawernavanimals

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(private val mContext: Context?, private val mItems: ArrayList<Animal>) :
    RecyclerView.Adapter<MyAdapter.MyHolder>() {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyAdapter.MyHolder {
        val view = LayoutInflater.from(mContext).inflate(R.layout.item, parent, false)
        return MyHolder(view)
    }

    override fun onBindViewHolder(holder: MyAdapter.MyHolder, position: Int) {
        val currentItem = mItems[position]
        val image = currentItem.picture
        val title = currentItem.title
        val description = currentItem.description

        holder.mImage.setImageResource(image)
        holder.mTitle.text = title
        holder.mDescription.text = description.substring(0,70) + "..."
    }

    override fun getItemCount(): Int {
        return mItems.size
    }

    class MyHolder (itemView: View) : RecyclerView.ViewHolder(itemView) {
        var mTitle: TextView
        var mDescription: TextView
        var mImage: ImageView
        init {
            mTitle = itemView.findViewById(R.id.tv_title)
            mImage = itemView.findViewById(R.id.image_view)
            mDescription = itemView.findViewById(R.id.tv_descr)
        }

    }



}