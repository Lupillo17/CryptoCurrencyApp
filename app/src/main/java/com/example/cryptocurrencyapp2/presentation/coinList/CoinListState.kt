package com.example.cryptocurrencyapp2.presentation.coinList

import com.example.cryptocurrencyapp2.domain.model.Coin

data class CoinListState(
    val isLoading: Boolean = false,
    val coins: List<Coin> = emptyList(),
    val error: String = ""
)
