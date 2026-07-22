package com.legend.ultra.ui.theme

import androidx.compose.foundation.isSystemInDarkMode
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val NeonCyan = Color(0xFF00D9FF)
private val NeonPurple = Color(0xFFB800E6)
private val DarkBackground = Color(0xFF0A0E27)
private val CardBackground = Color(0xFF1A1F3A)
private val HolographicGreen = Color(0xFF00FF41)
private val AccentOrange = Color(0xFFFF6B35)

private val UltraDarkColorScheme = darkColorScheme(
    primary = NeonCyan,
    secondary = NeonPurple,
    tertiary = HolographicGreen,
    background = DarkBackground,
    surface = CardBackground,
    error = AccentOrange,
    onPrimary = DarkBackground,
    onSecondary = Color.White,
    onTertiary = DarkBackground,
    onBackground = Color.White,
    onSurface = Color.White,
)

@Composable
fun LegendUltraTheme(
    darkTheme: Boolean = isSystemInDarkMode(),
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colorScheme = UltraDarkColorScheme,
        typography = UltraTypography,
        content = content
    )
}

val UltraTypography = androidx.compose.material3.Typography()
