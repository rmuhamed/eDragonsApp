package com.rmuhamed.sample.myapp.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.rmuhamed.sample.myapp.api.APIConfiguration
import com.rmuhamed.sample.myapp.api.RetrofitConfiguration
import com.rmuhamed.sample.myapp.datasource.FlightsRepository
import com.rmuhamed.sample.myapp.model.Flight
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch
import kotlin.coroutines.CoroutineContext

class FlightsViewModel : ViewModel() {
    private val parentJob = Job()

    private val coroutineContext: CoroutineContext
        get() = parentJob.plus( Dispatchers.Default)

    private val scope = CoroutineScope(coroutineContext)

    private val repository = FlightsRepository(APIConfiguration.flightsAPI)

    val flightsLiveData = MutableLiveData<MutableList<Flight>>()

    fun getFlights() {
        scope.launch {
            val popularMovies = repository.getAll()
            flightsLiveData.postValue(popularMovies)
        }
    }

}