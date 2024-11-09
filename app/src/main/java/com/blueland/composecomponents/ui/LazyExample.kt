package com.blueland.composecomponents.ui

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun LazyColumnExample() {
    LazyColumn(modifier = Modifier.fillMaxSize()) {
        items(100) { index ->
            Text(
                text = "Item #$index",
                modifier = Modifier.padding(16.dp)
            )
        }
    }
}

@Composable
fun LazyRowExample() {
    LazyRow(modifier = Modifier.fillMaxSize()) {
        items(100) { index ->
            Text(
                text = "Item #$index",
                modifier = Modifier.padding(16.dp)
            )
        }
    }
}
