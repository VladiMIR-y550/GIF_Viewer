package com.mironenko.gifviewer.model.remote

import com.mironenko.gifviewer.model.GifEntity
import com.mironenko.gifviewer.model.IGifListRemoteDataSource
import retrofit2.Response
import javax.inject.Inject

class GifListRemoteDataSource @Inject constructor(
    private val giphyApi: GiphyApi,
    private val api_key: String
) :
    IGifListRemoteDataSource {

    override suspend fun downloadGifList(page: Int): Response<GifEntity> =
        giphyApi.downloadNews(API_KEY = api_key, page = page)
}