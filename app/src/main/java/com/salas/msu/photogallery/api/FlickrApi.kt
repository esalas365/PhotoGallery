package com.salas.msu.photogallery.api

import retrofit2.http.GET

private const val API_KEY = "5cb74b897343c5745da42bff74bb94b9"

interface FlickrApi {
    @GET(
        "services/rest/?method=flickr.interestingness.getList" +
                "&api_key=$API_KEY" +
                "&format=json" +
                "&nojsoncallback=1" +
                "&extras=url_s"
    )
    suspend fun fetchPhotos(): FlickrResponse

}