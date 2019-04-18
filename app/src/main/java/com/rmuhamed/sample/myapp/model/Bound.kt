package com.rmuhamed.sample.myapp.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Bound {
    @SerializedName("airline")
    @Expose
    var airline: String? = null
    @SerializedName("airlineImage")
    @Expose
    var airlineImage: String? = null
    @SerializedName("arrivalDate")
    @Expose
    var arrivalDate: String? = null
    @SerializedName("arrivalTime")
    @Expose
    var arrivalTime: String? = null
    @SerializedName("departureDate")
    @Expose
    var departureDate: String? = null
    @SerializedName("departureTime")
    @Expose
    var departureTime: String? = null
    @SerializedName("destination")
    @Expose
    var destination: String? = null
    @SerializedName("origin")
    @Expose
    var origin: String? = null
}
