package com.blueland.composecomponents.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

// 레이아웃 컴포저블 Column, Row, Box 예제 함수를 호출하는 함수
@Composable
fun LayoutExample() {
    Column(
        modifier = Modifier
            .fillMaxSize() // 화면 크기만큼 Column을 확장
            .padding(8.dp)
    ) {
        Text(text = "Column Layout")
        Spacer(modifier = Modifier.height(4.dp))
        ColumnExample()

        Spacer(modifier = Modifier.height(8.dp))

        Text(text = "Row Layout")
        Spacer(modifier = Modifier.height(4.dp))
        Row1Example()
        Spacer(modifier = Modifier.height(4.dp))
        Row2Example()

        Spacer(modifier = Modifier.height(8.dp))

        Text(text = "Box Layout")
        Spacer(modifier = Modifier.height(4.dp))
        Box1Example()
        Spacer(modifier = Modifier.height(4.dp))
        Box2Example()
    }
}

// 레이아웃 컴포저블 Column 예제 함수
@Composable
fun ColumnExample() {
    Column(
        modifier = Modifier
            .fillMaxWidth() // 가로로 꽉 차게
            .background(Color.LightGray) // 배경 색
            .padding(8.dp), // 내부 패딩
        verticalArrangement = Arrangement.spacedBy(4.dp), // 아이템 간의 간격을 8dp로 설정
        horizontalAlignment = Alignment.CenterHorizontally // 아이템을 수평으로 중앙 정렬
    ) {
        Text("Item 1")
        Text("Item 2")
        Text("Item 3")
    }
}

// 레이아웃 컴포저블 Row 예제 함수 1
@Composable
fun Row1Example() {
    Row(
        modifier = Modifier
            .fillMaxWidth() // 가로로 꽉 차게
            .background(Color.LightGray) // 배경 색
            .padding(8.dp), // 내부 패딩
        horizontalArrangement = Arrangement.SpaceBetween, // 아이템 사이에 고르게 간격을 주고 양쪽 끝으로 배치
        verticalAlignment = Alignment.CenterVertically // 아이템을 수직으로 중앙 정렬
    ) {
        Text("Left")
        Text("Center")
        Text("Right")
    }
}

// 레이아웃 컴포저블 Row 예제 함수 2
@Composable
fun Row2Example() {
    Row(
        modifier = Modifier
            .fillMaxWidth() // Row의 너비를 화면 가득 채우기
            .background(Color.LightGray) // 배경 색
            .padding(8.dp), // 내부 패딩
        horizontalArrangement = Arrangement.spacedBy(10.dp, Alignment.CenterHorizontally), // 아이템 간의 간격을 20dp로 설정하고, 수평으로 중앙 정렬
        verticalAlignment = Alignment.CenterVertically // 아이템을 수직으로 중앙 정렬
    ) {
        Text("Left")
        Text("Center")
        Text("Right")
    }
}

// 레이아웃 컴포저블 Box 예제 함수 1
@Composable
fun Box1Example() {
    Box(
        modifier = Modifier
            .size(150.dp) // 크기
            .background(Color.LightGray), // 배경 색
        contentAlignment = Alignment.Center // Box 내에서 아이템을 중앙 정렬
    ) {
        // 원형 박스
        Box(
            modifier = Modifier
                .size(50.dp)
                .background(Color.Blue, CircleShape)
        )
        // 텍스트
        Text(
            text = "Centered",
            color = Color.White
        )
    }
}

// 레이아웃 컴포저블 Box 예제 함수 2
@Composable
fun Box2Example() {
    Box(
        modifier = Modifier
            .size(150.dp) // 크기
            .background(Color.LightGray), // 배경 색
        contentAlignment = Alignment.TopStart // Box 내에서 아이템을 상단 왼쪽으로 정렬
    ) {
        // 원형 박스
        Box(
            modifier = Modifier
                .size(50.dp)
                .background(Color.Blue, CircleShape)
        )
        // 텍스트
        Text(
            text = "Centered",
            color = Color.White
        )
    }
}