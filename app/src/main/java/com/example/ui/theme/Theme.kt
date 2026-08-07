package com.example.ui.theme

import android.app.Activity
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalView
import androidx.core.view.WindowCompat

private val DarkColorScheme = darkColorScheme(
    primary = YellowGold,
    onPrimary = TextBlack,
    primaryContainer = YellowAmber,
    onPrimaryContainer = TextBlack,
    secondary = YellowBright,
    onSecondary = TextBlack,
    background = CharcoalBg,
    onBackground = TextWhite,
    surface = CharcoalSurface,
    onSurface = TextWhite,
    surfaceVariant = CharcoalCard,
    onSurfaceVariant = TextGray,
    outline = CharcoalBorder
)

@Composable
fun JadsonBarberTheme(
    content: @Composable () -> Unit
) {
    val view = LocalView.current
    if (!view.isInEditMode) {
        SideEffect {
            val context = view.context
            val window = (context as? Activity)?.window
                ?: (context as? android.content.ContextWrapper)?.baseContext?.let { (it as? Activity)?.window }
            window?.let { w ->
                w.statusBarColor = CharcoalBg.toArgb()
                WindowCompat.getInsetsController(w, view).isAppearanceLightStatusBars = false
            }
        }
    }

    MaterialTheme(
        colorScheme = DarkColorScheme,
        typography = Typography,
        content = content
    )
}

