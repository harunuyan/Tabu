package com.volie.tabu.service

import com.volie.tabu.util.Constant.CONTENT_API
import retrofit2.Response
import retrofit2.http.GET

interface WordsAPI {
    @GET(CONTENT_API)
    fun getWordsFromInternet(): Response<com.volie.tabu.model.Result>
}