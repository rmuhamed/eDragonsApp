package com.rmuhamed.sample.myapp.datasource

import com.rmuhamed.sample.myapp.api.IFlightsAPI
import com.rmuhamed.sample.myapp.model.Flight

class FlightsRepository(private val api: IFlightsAPI) : RepositoryHandler() {
    //Take a look to suspend
    suspend fun getAll() : MutableList<Flight>? {

        val flightDTO = doDeferredCall(
                call = { api.retrieveFlightsAsync().await() },
                errorMessage = "Error Fetching Popular Movies"
        )

        return flightDTO?.results?.toMutableList();
    }
}