package com.example.flixsterforthebestmovie
import com.google.gson.annotations.SerializedName

class Movie{

    @SerializedName("original_title")
    var title: String? = null

    @JvmField
    @SerializedName("overview")
    var description: String? = null

    @JvmField
    @SerializedName("poster_path")
    var movieImageUrl: String? = null
}