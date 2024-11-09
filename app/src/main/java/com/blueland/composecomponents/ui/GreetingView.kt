package com.blueland.composecomponents.ui

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

// 컴포저블 함수 예제
@Composable
fun GreetingView(name: String) {
    // GreetingView 컴포저블에서 Text를 사용해 텍스트를 표시
    Text(text = "Hello, $name!")
}