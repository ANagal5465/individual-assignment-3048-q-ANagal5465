package app.plantdiary.individualassignment3048q.dto

import com.google.gson.annotations.SerializedName
//Data class for the Country object
data class Country(@SerializedName("Code")var code: String, @SerializedName("Name") var name:String)
