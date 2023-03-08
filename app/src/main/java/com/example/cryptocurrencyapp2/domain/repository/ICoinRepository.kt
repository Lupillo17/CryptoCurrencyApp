package com.example.cryptocurrencyapp2.domain.repository

import com.example.cryptocurrencyapp2.data.remote.dto.CoinDetailDto
import com.example.cryptocurrencyapp2.data.remote.dto.CoinDto

interface ICoinRepository {
    suspend fun getCoins(): List<CoinDto>
    suspend fun getCoinById(coinId: String): CoinDetailDto
}