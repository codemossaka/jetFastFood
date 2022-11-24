package com.godsonpeya.fastfood.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.godsonpeya.fastfood.R

// Set of Material typography styles to start with

val brandon = FontFamily(
    Font(R.font.brandon_grotesque_black),
    Font(R.font.brandon_grotesque_light, FontWeight.Light),
    Font(R.font.brandon_grotesque_bold_italic, FontWeight.Bold, FontStyle.Italic),
    Font(R.font.brandon_grotesque_light_italic, FontWeight.Light, FontStyle.Italic),
    Font(R.font.brandon_grotesque_medium_italic, FontWeight.Medium, FontStyle.Italic),
    Font(R.font.brandon_grotesque_regular_italic, FontWeight.Normal, FontStyle.Italic),
    Font(R.font.brandon_grotesque_thin_italic, FontWeight.Thin, FontStyle.Italic),
)

val title = FontFamily(
    Font(R.font.badscript_regular)
)
val Typography = Typography(
    defaultFontFamily = brandon,
    body1 = TextStyle(fontFamily = FontFamily.Default,
//    fontWeight = FontWeight.Normal,
    fontSize = 18.sp),
    subtitle1 = TextStyle(
        fontFamily = title
    ),
    /* Other default text styles to override */
    button = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.W500,
        fontSize = 17.sp
    ),
    /*
    caption = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp
    )
    */)