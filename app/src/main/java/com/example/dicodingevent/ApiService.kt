package com.example.dicodingevent
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query




interface ApiService {
    @GET("events")
    suspend fun getEvents(@Query("active") active: Int): List<Event>

    @GET("events")
    suspend fun searchEvents(@Query("q") query: String): List<Event>
}



