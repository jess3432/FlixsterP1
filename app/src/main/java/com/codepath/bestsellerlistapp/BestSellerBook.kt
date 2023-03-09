package com.codepath.bestsellerlistapp

import com.google.gson.annotations.SerializedName

/**
 * The Model for storing a movie from the Movie DB
 *
 * SerializedName tags MUST match the JSON response for the
 * object to correctly parse with the gson library.
 */
class BestSellerBook {
    //Movie Title
    @JvmField
    @SerializedName("original_title")
    var title: String? = null

    //Movie Image URL
    @JvmField
    @SerializedName("poster_path")
    var movieImageUrl: String? = null

    @JvmField
    @SerializedName("overview")
    var description: String? = null
}