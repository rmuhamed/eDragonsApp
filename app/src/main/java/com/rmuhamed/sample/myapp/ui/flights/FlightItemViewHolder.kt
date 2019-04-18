package com.rmuhamed.sample.myapp.ui.flights

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.rmuhamed.sample.myapp.model.Flight
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.flight_item_inbound.view.*
import kotlinx.android.synthetic.main.flight_item_outbound.view.*

class FlightItemViewHolder(item: View) : RecyclerView.ViewHolder(item) {
    fun bind(flight: Flight) {
        with(flight) {
            paintInboundSection()

            paintOutboundSection()
        }
    }

    private fun Flight.paintOutboundSection() {
        Picasso.get().load(this.outbound.airlineImage).into(itemView.flight_item_outbound_airline_image)
        itemView.flight_item_outbound_airline_name.text = outbound.airline
        itemView.flight_item_outbound_origin.text = outbound.origin
        itemView.flight_item_outbound_destination.text = outbound.destination
        itemView.flight_item_outbound_departure_date.text = outbound.departureDate
        itemView.flight_item_outbound_departure_time.text = outbound.departureTime
        itemView.flight_item_outbound_arrival_date.text = outbound.arrivalDate
        itemView.flight_item_outbound_arrival_time.text = outbound.arrivalTime
    }

    private fun Flight.paintInboundSection() {
        Picasso.get().load(this.inbound.airlineImage).into(itemView.flight_item_inbound_airline_image)
        itemView.flight_item_inbound_airline_name.text = inbound.airline
        itemView.flight_item_inbound_origin.text = inbound.origin
        itemView.flight_item_inbound_destination.text = inbound.destination
        itemView.flight_item_inbound_departure_date.text = inbound.departureDate
        itemView.flight_item_inbound_departure_time.text = inbound.departureTime
        itemView.flight_item_inbound_arrival_date.text = inbound.arrivalDate
        itemView.flight_item_inbound_arrival_time.text = inbound.arrivalTime
    }
}