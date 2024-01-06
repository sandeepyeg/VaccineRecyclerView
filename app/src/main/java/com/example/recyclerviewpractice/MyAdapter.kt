package com.example.recyclerviewpractice

import android.health.connect.datatypes.units.Length
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(val vaccineList: ArrayList<VaccineModel>):RecyclerView.Adapter<MyAdapter.MyViewHolder>() {

    inner class MyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
       lateinit var vaccineTitle:TextView
       lateinit var vaccineOrigin:TextView

        init {
            vaccineTitle = itemView.findViewById(R.id.VaccineName)
            vaccineOrigin = itemView.findViewById(R.id.VaccineOrigin)
            itemView.setOnClickListener{
                Toast.makeText(itemView.context,"you have selected ${vaccineList[adapterPosition].vaccineName}",Toast.LENGTH_LONG).show()
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.recycler_item, parent, false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return vaccineList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.vaccineTitle.setText(vaccineList[position].vaccineName)
        holder.vaccineOrigin.setText(vaccineList[position].originCountry)
    }
}