package com.example.recyclerviewsample.adapter

import android.content.Context
import android.graphics.Paint
import android.media.Rating
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewsample.R
import com.example.recyclerviewsample.model.PopularProducts
import org.w3c.dom.Text

class PopularProductsAdapter(val context: Context, val dataset: List<PopularProducts>) :
    RecyclerView.Adapter<PopularProductsAdapter.PopularProductsViewHolder>() {
    class PopularProductsViewHolder(view: View) : RecyclerView.ViewHolder(view) {
//            val pp_status : Int,
//    val pp_discount : Int,
//    val pp_product: Int,
//    val pp_brand: Int,
//    val pp_rating :Int,
//    val pp_final_price : Int,
//    val pp_original_price : Int
        val status : TextView = view.findViewById(R.id.status)
        val final_price  : TextView = view.findViewById(R.id.popular_price)
        val product : TextView = view.findViewById(R.id.product_name)
        val brand : TextView = view.findViewById(R.id.popular_brand)
        val image :ImageView = view.findViewById(R.id.image_view)
        val ratingBar :RatingBar = view.findViewById(R.id.ratingBar2)
        val originalPrice : TextView = view.findViewById(R.id.original_price)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PopularProductsViewHolder {

        return PopularProductsViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.popular_item,parent,false))
    }

    override fun onBindViewHolder(holder: PopularProductsViewHolder, position: Int) {
        val item= dataset[position]
        holder.status.text = context.resources.getString(item.pp_status)
        holder.final_price.text = context.resources.getString(item.pp_final_price)
        holder.product.text = context.resources.getString(item.pp_product)
        holder.brand.text = context.resources.getString(item.pp_brand)
        holder.image.setImageResource(item.pp_image)
        holder.ratingBar.rating= context.resources.getString(item.pp_rating).toFloat()
        holder.originalPrice.text=context.resources.getString(item.pp_original_price)
        holder.originalPrice.setPaintFlags(Paint.STRIKE_THRU_TEXT_FLAG)

    }

    override fun getItemCount(): Int {
        return dataset.size
    }
}