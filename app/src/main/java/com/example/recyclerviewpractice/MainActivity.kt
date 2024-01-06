package com.example.recyclerviewpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView:RecyclerView = findViewById(R.id.recyclerViewList)
        recyclerView.layoutManager = LinearLayoutManager(this,
            LinearLayoutManager.VERTICAL,false)
        var vaccineList:ArrayList<VaccineModel> = ArrayList<VaccineModel>()

        vaccineList.add(VaccineModel("Pfizer-BioNTech", "USA"))
        vaccineList.add(VaccineModel("Moderna", "USA"))
        vaccineList.add(VaccineModel("AstraZeneca", "UK"))
        vaccineList.add(VaccineModel("Johnson & Johnson", "USA"))
        vaccineList.add(VaccineModel("Sinovac", "China"))
        vaccineList.add(VaccineModel("Sputnik V", "Russia"))
        vaccineList.add(VaccineModel("Sinopharm", "China"))
        vaccineList.add(VaccineModel("Novavax", "USA"))
        vaccineList.add(VaccineModel("Covaxin", "India"))
        vaccineList.add(VaccineModel("Covovax", "India"))


        val adapter = MyAdapter(vaccineList)

        recyclerView.adapter = adapter


    }
}