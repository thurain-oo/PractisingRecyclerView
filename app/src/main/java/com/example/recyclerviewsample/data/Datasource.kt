package com.example.recyclerviewsample.data

import com.example.recyclerviewsample.R
import com.example.recyclerviewsample.model.Cameras
import com.example.recyclerviewsample.model.ChosenByCountry
import com.example.recyclerviewsample.model.LatestArrival
import com.example.recyclerviewsample.model.PopularProducts

class Datasource {
    fun loadCameras(): List<Cameras> {
        return listOf(
            Cameras(
                cameras_title = R.string.cameras_title1,
                cameras_description = R.string.cameras_description1,
                cameras_image = R.drawable.leica_camera
            ),
            Cameras(
                cameras_title = R.string.cameras_title2,
                cameras_description = R.string.cameras_description2,
                cameras_image = R.drawable.nikon_camera
            ),
            Cameras(
                cameras_title = R.string.cameras_title3,
                cameras_description = R.string.cameras_description3,
                cameras_image = R.drawable.sony
            )

        )
    }

    fun loadChosenByCountry(): List<ChosenByCountry>{
        return listOf(
            ChosenByCountry(R.string.country_name1,R.drawable.japan),
            ChosenByCountry(R.string.country_name2,R.drawable.korea),
            ChosenByCountry(R.string.country_name3,R.drawable.china),
            ChosenByCountry(R.string.country_name4,R.drawable.international),


            )
    }

    fun loadLatestArrival(): List<LatestArrival>{
        return listOf(
            LatestArrival(R.drawable.lv,R.string.la_productName1,R.string.la_bandName1,R.string.la_prices1,R.string.la_rating1),
            LatestArrival(R.drawable.horns_pink_long_sleeve_shirt,R.string.la_productName2,R.string.la_bandName2,R.string.la_prices2,R.string.la_rating2),
            LatestArrival(R.drawable.iphone12,R.string.la_productName3,R.string.la_bandName3,R.string.la_prices3,R.string.la_rating3),
            )
    }

    fun loadPopularProducts(): List<PopularProducts>{
        return listOf(
            PopularProducts(R.string.pp_status1,R.string.pp_discount1, R.string.pp_product1,R.string.pp_brand1,R.string.pp_rating1,R.string.pp_final_price1,R.drawable.iphone12,R.string.pp_original_price1),
            PopularProducts(R.string.pp_status2,R.string.pp_discount2, R.string.pp_product2,R.string.pp_brand2,R.string.pp_rating2,R.string.pp_final_price2,R.drawable.lv,R.string.pp_original_price2),
            PopularProducts(R.string.pp_status3,R.string.pp_discount3, R.string.pp_product3,R.string.pp_brand3,R.string.pp_rating3,R.string.pp_final_price3,R.drawable.iphone12,R.string.pp_original_price3),
            PopularProducts(R.string.pp_status4,R.string.pp_discount4, R.string.pp_product4,R.string.pp_brand4,R.string.pp_rating4,R.string.pp_final_price4,R.drawable.nikon_camera,R.string.pp_original_price4)

            )
    }

}