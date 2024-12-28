package com.andersenunity.filmposter.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.andersenunity.filmposter.R

// Set of Material typography styles to start with
val Typography = Typography(
    h1 = TextStyle(
        fontFamily = FontFamily(Font(R.font.roboto_italic)),
        fontSize = 24.sp,
    ),
    h2 = TextStyle(
        fontFamily = FontFamily(Font(R.font.roboto_bold)),
        fontWeight = FontWeight.Bold,
        fontSize = 20.sp,
        color = Color.White
    ),
    h3 = TextStyle(
        fontFamily = FontFamily(Font(R.font.roboto_bold)),
        fontWeight = FontWeight.Bold,
        fontSize = 24.sp,
        color = Color.Black
    )
)
val robotoFamily = FontFamily(
    Font(R.font.roboto_medium, FontWeight.SemiBold),
    Font(R.font.roboto_light_italic, FontWeight.Light),

    )