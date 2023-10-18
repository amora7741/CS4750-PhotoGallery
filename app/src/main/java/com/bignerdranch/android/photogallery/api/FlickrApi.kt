package com.bignerdranch.android.photogallery.api

import retrofit2.http.GET

private const val API_KEY = "7bb253550270a5f55bc617bc0984c72c"

interface FlickrApi {

    @GET(
        "services/rest/?method=flickr.interestingness.getList" +
                "&api_key=$API_KEY" +
                "&format=json" +
                "&nojsoncallback=1" +
                "&extras=url_s"
    )

    suspend fun fetchPhotos(): String
}
