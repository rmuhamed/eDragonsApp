package com.rmuhamed.sample.myapp.api

object APIConfiguration {
    private const val baseURL = "https://odigeo-testandroid.herokuapp.com"

    val flightsAPI: IFlightsAPI =
            RetrofitConfiguration.with(baseURL)
                    .create(IFlightsAPI::class.java)
}