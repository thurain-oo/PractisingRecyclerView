package com.example.recyclerviewsample.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewsample.R
import com.example.recyclerviewsample.model.ChosenByCountry
import org.w3c.dom.Text

class ChosenByCountryAdapter(val context: Context, val dataset: List<ChosenByCountry>) :
    RecyclerView.Adapter<ChosenByCountryAdapter.ChosenByCountryViewHolder>() {
    class ChosenByCountryViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val countryImage: ImageView = view.findViewById(R.id.chosen_by_country_imageview)
        val countryName: TextView = view.findViewById(R.id.chosen_by_country_textview)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChosenByCountryViewHolder {

        return ChosenByCountryViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.chosen_by_country_item, parent, false)
        )
    }

    override fun onBindViewHolder(holder: ChosenByCountryViewHolder, position: Int) {
    val item = dataset[position]
        holder.countryImage.setImageResource(item.country_image)
        holder.countryName.text = context.resources.getString(item.country_name)
    }

    override fun getItemCount(): Int {
        return dataset.size
    }
}