package com.example.recyclerviewsample.adapter


import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewsample.R
import com.example.recyclerviewsample.model.Cameras

class CamerasAdapter(val context : Context, val dataset : List<Cameras>): RecyclerView.Adapter<CamerasAdapter.CamerasViewHolder>()
{
  class CamerasViewHolder(view : View): RecyclerView.ViewHolder(view){
      val imageView :ImageView = view.findViewById(R.id.camera_image)
    val title : TextView = view.findViewById(R.id.camera_title)
    val description : TextView = view.findViewById(R.id.camera_description)
  }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CamerasViewHolder {
      return CamerasViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.camera_item,parent,false))
    }

    override fun onBindViewHolder(holder: CamerasViewHolder, position: Int) {
      val item = dataset[position]
    holder.imageView.setImageResource(item.cameras_image)
      holder.title.text = context.resources.getString(item.cameras_title)
      holder.description.text = context.resources.getString(item.cameras_description)
    }

    override fun getItemCount(): Int {
        return dataset.size
    }
}

