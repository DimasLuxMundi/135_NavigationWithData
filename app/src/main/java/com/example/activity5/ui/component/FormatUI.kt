package com.example.activity5.ui.component

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import com.example.activity5.R

@Composable
fun FormatLabelHarga(subtotal: String, modifier: Modifier = Modifier) {
    Text(
        text = stringResource( R.string.subtotal_price, subtotal),
        modifier = modifier,
        style = MaterialTheme.typography.headlineSmall
    )
}

@Composable
fun FormatDataPemesanan(namaPemesanan: String, modifier: Modifier = Modifier){
    Text(text = stringResource(R.string.namaOrder, namaPemesanan),
        modifier = Modifier,
        style = MaterialTheme.typography.headlineSmall
        )

}