package com.rmuhamed.sample.myapp.api

import com.rmuhamed.sample.myapp.datasource.FlightDTO
import kotlinx.coroutines.Deferred
import retrofit2.Response
import retrofit2.http.GET

interface IFlightsAPI {
    @GET("/") fun retrieveFlightsAsync(): Deferred<Response<FlightDTO>>
}