package com.rmuhamed.sample.myapp.ui.flights

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import com.rmuhamed.sample.myapp.R
import com.rmuhamed.sample.myapp.viewmodel.FlightsViewModel
import kotlinx.android.synthetic.main.fligths_activity.*

class FlightsActivity : AppCompatActivity() {
    lateinit var viewModel: FlightsViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fligths_activity)

        viewModel = ViewModelProviders.of(this).get(FlightsViewModel::class.java)

        loading_in_progress.visibility = View.VISIBLE
        viewModel.getFlights()

        viewModel.flightsLiveData.observe(this,
                Observer {
                    loading_in_progress.visibility = View.GONE
                    flights_recycler_list.visibility = View.VISIBLE
                    (flights_recycler_list.adapter as FlightsAdapter).paintItemsFrom(it)
                })

        flights_recycler_list.apply {
            layoutManager = LinearLayoutManager(this.context)
            adapter = FlightsAdapter()
        }
    }
}
