package com.example.colleaguescontact.repository

import com.example.colleaguescontact.data.model.people.PeopleItemPeopleModel
import com.example.colleaguescontact.data.model.rooms.RoomsItemRoomsModel
import com.example.colleaguescontact.remote.ApiDetails

class Repository {
    suspend fun getPeople(): List<PeopleItemPeopleModel>{
        return ApiDetails.apiService.getPeople()
    }
    suspend fun getRooms():List<RoomsItemRoomsModel>{
        return ApiDetails.apiService.getRooms()
    }
}