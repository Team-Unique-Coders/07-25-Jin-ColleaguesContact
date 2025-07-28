package com.example.colleaguescontact.remote

import com.example.colleaguescontact.data.model.people.People
import com.example.colleaguescontact.data.model.people.PeopleItemPeopleModel
import com.example.colleaguescontact.data.model.rooms.RoomsItemRoomsModel
import retrofit2.http.GET

interface ApiService {
    @GET(value = ApiDetails.END_POINT_ONE)
    suspend fun getPeople(): List<PeopleItemPeopleModel>
    @GET(value = ApiDetails.END_POINT_TWO)
    suspend fun getRooms(): List<RoomsItemRoomsModel>
}