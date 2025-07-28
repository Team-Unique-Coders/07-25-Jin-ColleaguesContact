package com.example.colleaguescontact.data.model.people


import com.google.gson.annotations.SerializedName

data class DataPeople(
    @SerializedName("body")
    var body: String? = "",
    @SerializedName("fromId")
    var fromId: String? = "",
    @SerializedName("id")
    var id: String? = "",
    @SerializedName("meetingid")
    var meetingid: String? = "",
    @SerializedName("title")
    var title: String? = "",
    @SerializedName("toId")
    var toId: String? = ""
)