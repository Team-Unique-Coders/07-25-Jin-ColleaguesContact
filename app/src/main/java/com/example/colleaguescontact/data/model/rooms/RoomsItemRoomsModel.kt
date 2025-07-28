package com.example.colleaguescontact.data.model.rooms


import com.google.gson.annotations.SerializedName

data class RoomsItemRoomsModel(
    @SerializedName("createdAt")
    var createdAt: String? = "",
    @SerializedName("id")
    var id: String? = "",
    @SerializedName("isOccupied")
    var isOccupied: Boolean? = false,
    @SerializedName("maxOccupancy")
    var maxOccupancy: Int? = 0
)