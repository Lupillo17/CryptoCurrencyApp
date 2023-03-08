package com.example.cryptocurrencyapp2.presentation.coinDetail.components

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp

@Composable
fun CoinTag(
    tag: String
) {
    Card(
        backgroundColor = MaterialTheme.colors.primary,
        shape = RoundedCornerShape(100.dp),
        elevation = 4.dp
//            .background(color = MaterialTheme.colors.secondary)
    ) {
        Text(
            text = tag,
            color = Color.White,
            textAlign = TextAlign.Center,
            style = MaterialTheme.typography.body2,
            modifier = Modifier.padding(10.dp),
//            fontWeight = FontWeight.Bold
        )

    }
}