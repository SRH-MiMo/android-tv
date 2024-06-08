package com.example.android_tv.ui.theme

import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import androidx.tv.material3.ExperimentalTvMaterial3Api
import androidx.tv.material3.Typography
import com.example.android_tv.R

val sdgothic_h = FontFamily(
    Font(R.font.sdgothic_h, FontWeight.Normal, FontStyle.Normal)
)

val sdgothic_b = FontFamily(
    Font(R.font.sdgothic_b, FontWeight.Normal, FontStyle.Normal),
)

// Set of Material typography styles to start with
@OptIn(ExperimentalTvMaterial3Api::class)
val Typography = Typography(
    bodyLarge = TextStyle(
        fontFamily = sdgothic_h,
        fontWeight = FontWeight.Normal,
        fontStyle = FontStyle.Normal,
    ),

    bodyMedium = TextStyle(
        fontFamily = sdgothic_b,
        fontWeight = FontWeight.Normal,
        fontStyle = FontStyle.Normal,
    )

    /* Other default text styles to override
    titleLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 22.sp,
        lineHeight = 28.sp,
        letterSpacing = 0.sp
    ),
    labelSmall = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Medium,
        fontSize = 11.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.5.sp
    )
    */
)