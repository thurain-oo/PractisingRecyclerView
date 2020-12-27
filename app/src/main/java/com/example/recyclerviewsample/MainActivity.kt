package com.example.recyclerviewsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.recyclerviewsample.adapter.CamerasAdapter
import com.example.recyclerviewsample.adapter.ChosenByCountryAdapter
import com.example.recyclerviewsample.adapter.LatestArrivalAdapter
import com.example.recyclerviewsample.adapter.PopularProductsAdapter
import com.example.recyclerviewsample.data.Datasource
import com.example.recyclerviewsample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val chosenByCountrySet = Datasource().loadChosenByCountry()
        binding.recyclerView3.adapter = ChosenByCountryAdapter(this,chosenByCountrySet)

        val cameraSet = Datasource().loadCameras()
        binding.recyclerView1.adapter = CamerasAdapter(this,cameraSet)

        val latestArrivalSet = Datasource().loadLatestArrival()
        binding.recyclerView2.adapter = LatestArrivalAdapter(this, latestArrivalSet)

        val popularProductsSet =Datasource().loadPopularProducts()
        binding.recyclerView4.adapter = PopularProductsAdapter(this,popularProductsSet)

    }
}