package com.example.colleaguescontact.data.model.people


import com.google.gson.annotations.SerializedName

data class PeopleItemPeopleModel(
    @SerializedName("avatar")
    var avatar: String? = "",
    @SerializedName("createdAt")
    var createdAt: String? = "",
    @SerializedName("data")
    var `data`: DataPeople? = DataPeople(),
    @SerializedName("email")
    var email: String? = "",
    @SerializedName("favouriteColor")
    var favouriteColor: String? = "",
    @SerializedName("firstName")
    var firstName: String? = "",
    @SerializedName("fromName")
    var fromName: String? = "",
    @SerializedName("id")
    var id: String? = "",
    @SerializedName("jobtitle")
    var jobtitle: String? = "",
    @SerializedName("lastName")
    var lastName: String? = "",
    @SerializedName("name")
    var name: String? = "",
    @SerializedName("size")
    var size: String? = "",
    @SerializedName("to")
    var to: String? = "",
    @SerializedName("type")
    var type: String? = "",
    @SerializedName("{}")
    var x: String? = ""
)