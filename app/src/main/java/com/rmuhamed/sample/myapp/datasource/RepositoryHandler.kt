package com.rmuhamed.sample.myapp.datasource

import android.util.Log
import retrofit2.Response

open class RepositoryHandler {

     suspend fun <T : Any> doDeferredCall(call: suspend () -> Response<T>, errorMessage: String): T? {
        val response = call.invoke()

        var data : T? = null

        when(response.isSuccessful) {
            true  -> data = response.body()!!
            false -> Log.d("In RepositoryHandler", "$errorMessage & Exception - ${response.message()}")
        }

        return data
    }
}