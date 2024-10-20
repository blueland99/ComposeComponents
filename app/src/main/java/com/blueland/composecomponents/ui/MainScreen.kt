package com.blueland.composecomponents.ui

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun MainScreen() {
    // MainScreen에서 GreetingView 컴포저블을 호출하고 문자열을 전달
    GreetingView("Android Compose")
}

@Composable
fun GreetingView(name: String) {
    // GreetingView 컴포저블에서 Text를 사용해 텍스트를 표시
    Text(text = "Hello, $name!")
}

@Preview(showBackground = true)
@Composable
fun Preview() {
    Scaffold { paddingValues ->
        Box(modifier = Modifier.padding(paddingValues).fillMaxSize()) {
            MainScreen()
        }
    }
}
