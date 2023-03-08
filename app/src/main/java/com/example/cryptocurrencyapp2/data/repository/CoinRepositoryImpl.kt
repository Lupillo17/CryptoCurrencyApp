package com.example.cryptocurrencyapp2.data.repository

import com.example.cryptocurrencyapp2.data.remote.dto.CoinDetailDto
import com.example.cryptocurrencyapp2.data.remote.dto.CoinDto
import com.example.cryptocurrencyapp2.data.remote.dto.ICoinPaprikaAPI
import com.example.cryptocurrencyapp2.domain.repository.ICoinRepository
import javax.inject.Inject

class CoinRepositoryImpl @Inject constructor(
    private val api: ICoinPaprikaAPI
) : ICoinRepository {
    override suspend fun getCoins(): List<CoinDto> {
        return api.getCoins()
    }

    override suspend fun getCoinById(coinId: String): CoinDetailDto {
        return api.getCoinsById(coinId)
    }
}