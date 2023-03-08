package com.example.cryptocurrencyapp2.data.remote.dto

import retrofit2.http.GET
import retrofit2.http.Path

interface ICoinPaprikaAPI {
    @GET("/v1/coins")
    suspend fun getCoins(): List<CoinDto>

    @GET("/v1/coins/{coinId}")
    suspend fun getCoinsById(@Path("coinId") coinId: String): CoinDetailDto
}