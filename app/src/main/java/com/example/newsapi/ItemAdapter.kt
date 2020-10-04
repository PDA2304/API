package com.example.newsapi

import android.content.Context
import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Filter
import android.widget.Filterable
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class ItemAdapter(
    private val context: Context,
    private val news: List<ItemOfList>,
    val listener: (ItemOfList) -> Unit
) : RecyclerView.Adapter<ItemAdapter.ImageViewHolder>() {
    class ImageViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        val _Name = view.findViewById<TextView>(R.id.Name)
        val _title = view.findViewById<TextView>(R.id.title)

        fun bindView(date: ItemOfList, listener: (ItemOfList) -> Unit) {
            _Name.text = date.name
            _title.text = date.title
            itemView.setOnClickListener { listener(date) }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageViewHolder =
        ImageViewHolder(
            LayoutInflater.from(context).inflate(R.layout.item_of_list, parent, false)
        )

    override fun getItemCount(): Int = news.size

    override fun onBindViewHolder(holder: ImageViewHolder, position: Int) {
        holder.bindView(news[position], listener)
    }
}