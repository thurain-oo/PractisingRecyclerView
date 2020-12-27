package com.example.recyclerviewsample.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewsample.R
import com.example.recyclerviewsample.model.LatestArrival


class LatestArrivalAdapter(val context: Context, val dataset: List<LatestArrival>) :
    RecyclerView.Adapter<LatestArrivalAdapter.LatestArrivalViewHolder>() {
    class LatestArrivalViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val imageView: ImageView = view.findViewById(R.id.imageView)
        val itemType: TextView = view.findViewById(R.id.item_type)
        val brand: TextView = view.findViewById(R.id.brand)
        val price: TextView = view.findViewById(R.id.price)
        val ratingBar: RatingBar = view.findViewById(R.id.ratingBar)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LatestArrivalViewHolder {
        return LatestArrivalViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.latestarrival_item, parent, false)
        )
    }

    override fun onBindViewHolder(holder: LatestArrivalViewHolder, position: Int) {
        val item = dataset[position]
        holder.imageView.setImageResource(item.la_image)
        holder.itemType.text = context.resources.getString(item.la_productName)
        holder.brand.text = context.resources.getString(item.la_bandName)
        holder.price.text = context.resources.getString(item.la_prices)
        holder.ratingBar.rating = context.resources.getString(item.la_rating).toFloat()

    }

    override fun getItemCount(): Int {
        return dataset.size
    }
}