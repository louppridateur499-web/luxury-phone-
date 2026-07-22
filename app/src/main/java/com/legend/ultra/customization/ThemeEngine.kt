package com.legend.ultra.customization

import androidx.compose.ui.graphics.Color
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

data class ThemeProfile(
    val name: String,
    val primaryColor: Color,
    val secondaryColor: Color,
    val accentColor: Color,
    val backgroundColor: Color,
    val cardColor: Color
)

val CYBERPUNK_THEME = ThemeProfile(
    name = "Cyberpunk Neon",
    primaryColor = Color(0xFF00D9FF),
    secondaryColor = Color(0xFFB800E6),
    accentColor = Color(0xFF00FF41),
    backgroundColor = Color(0xFF0A0E27),
    cardColor = Color(0xFF1A1F3A)
)

val DARK_VOID_THEME = ThemeProfile(
    name = "Dark Void",
    primaryColor = Color(0xFFFFFFFF),
    secondaryColor = Color(0xFF888888),
    accentColor = Color(0xFFFF6B35),
    backgroundColor = Color(0xFF000000),
    cardColor = Color(0xFF1A1A1A)
)

val HOLOGRAPHIC_THEME = ThemeProfile(
    name = "Holographic",
    primaryColor = Color(0xFF00FF88),
    secondaryColor = Color(0xFFFF00FF),
    accentColor = Color(0xFF00FFFF),
    backgroundColor = Color(0xFF0F1419),
    cardColor = Color(0xFF1A2633)
)

class ThemeEngine : ViewModel() {
    private val _currentTheme = MutableStateFlow(CYBERPUNK_THEME)
    val currentTheme: StateFlow<ThemeProfile> = _currentTheme
    
    private val themes = listOf(
        CYBERPUNK_THEME,
        DARK_VOID_THEME,
        HOLOGRAPHIC_THEME
    )
    
    fun setTheme(themeProfile: ThemeProfile) {
        viewModelScope.launch {
            _currentTheme.value = themeProfile
        }
    }
    
    fun getAvailableThemes(): List<ThemeProfile> = themes
    
    fun createCustomTheme(
        name: String,
        primary: Color,
        secondary: Color,
        accent: Color
    ): ThemeProfile {
        return ThemeProfile(
            name = name,
            primaryColor = primary,
            secondaryColor = secondary,
            accentColor = accent,
            backgroundColor = Color(0xFF0A0E27),
            cardColor = Color(0xFF1A1F3A)
        )
    }
}
