package com.example.ui.theme

import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color

// Elegant Dark Charcoal Black shades (Preto Carvão Elegante)
val CharcoalBg = Color(0xFF0F0F0F)
val CharcoalSurface = Color(0xFF1A1A1A)
val CharcoalCard = Color(0xFF1A1A1A)
val CharcoalCardLight = Color(0xFF222222)
val CharcoalBorder = Color(0x26F7A800) // 15% Gold border accent

// Yellow accents (Tom Ouro / Âmbar Ouro da Arte Jadson Barber)
val YellowGold = Color(0xFFF7A800)
val YellowAmber = Color(0xFFE09000)
val YellowBright = Color(0xFFFFC01D)
val YellowDim = Color(0xFFC78000)

// Text Colors
val TextWhite = Color(0xFFFFFFFF)
val TextGray = Color(0xFF9E9E9E)
val TextDarkGray = Color(0xFF616161)
val TextBlack = Color(0xFF000000)

// Vibrant Gold / Amber Linear Gradient Brushes
val YellowGradient = Brush.linearGradient(
    colors = listOf(Color(0xFFFFC01D), Color(0xFFF7A800))
)

val YellowGradientVertical = Brush.verticalGradient(
    colors = listOf(Color(0xFFFFC01D), Color(0xFFE09000))
)

val DarkCardGradient = Brush.verticalGradient(
    colors = listOf(Color(0xFF222222), Color(0xFF1A1A1A))
)


