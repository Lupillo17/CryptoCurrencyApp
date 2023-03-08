package com.example.cryptocurrencyapp2.core.di

import com.example.cryptocurrencyapp2.core.common.Constants
import com.example.cryptocurrencyapp2.data.remote.dto.ICoinPaprikaAPI
import com.example.cryptocurrencyapp2.data.repository.CoinRepositoryImpl
import com.example.cryptocurrencyapp2.domain.repository.ICoinRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @Provides
    @Singleton
    fun providePaprikaAPI(): ICoinPaprikaAPI {
        return Retrofit.Builder()
            .baseUrl(Constants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(ICoinPaprikaAPI::class.java)
    }

    @Provides
    @Singleton
    fun provideCoinRepository(api: ICoinPaprikaAPI): ICoinRepository {
        return CoinRepositoryImpl(api)
    }
}