package com.rmuhamed.sample.myapp.ui.flights

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.rmuhamed.sample.myapp.R
import com.rmuhamed.sample.myapp.model.Flight

class FlightsAdapter : RecyclerView.Adapter<FlightItemViewHolder>() {

    private val items: MutableList<Flight> = mutableListOf();

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FlightItemViewHolder {
        val itemView = LayoutInflater
                .from(parent.context)
                .inflate(R.layout.flight_item, parent, false)

        return FlightItemViewHolder(itemView)
    }

    override fun getItemCount(): Int = items.size

    override fun onBindViewHolder(holder: FlightItemViewHolder, position: Int) = holder.bind(items[position])

    fun paintItemsFrom(flights: List<Flight>) {
        items.addAll(flights)
        notifyDataSetChanged()
    }
}