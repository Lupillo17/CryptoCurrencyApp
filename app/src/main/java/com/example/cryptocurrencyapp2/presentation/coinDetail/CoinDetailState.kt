package com.example.cryptocurrencyapp2.presentation.coinDetail

import com.example.cryptocurrencyapp2.domain.model.CoinDetail

data class CoinDetailState(
    val isLoading: Boolean = false,
    val coin: CoinDetail? = null,
    val error: String = ""
)
