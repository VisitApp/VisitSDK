package com.example.video_call.network

import android.content.Context


object APIServiceInstance {

    fun getApiService(
        baseUrl: String,
        applicationContext: Context,
        authToken: String,
        isTimeOutEnable: Boolean = true
    ): ApiService {
        return RetrofitBuilder.getRetrofit(baseUrl, applicationContext, authToken, isTimeOutEnable)
            .create(ApiService::class.java)
    }
}
