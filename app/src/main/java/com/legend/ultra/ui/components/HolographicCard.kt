package com.legend.ultra.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun HolographicCard(
    modifier: Modifier = Modifier,
    content: @Composable () -> Unit
) {
    val neonCyan = Color(0xFF00D9FF)
    val neonPurple = Color(0xFFB800E6)
    
    Box(
        modifier = modifier
            .background(
                color = Color(0xFF1A1F3A),
                shape = RoundedCornerShape(16.dp)
            )
            .border(
                width = 1.5.dp,
                brush = Brush.linearGradient(
                    colors = listOf(neonCyan, neonPurple)
                ),
                shape = RoundedCornerShape(16.dp)
            )
    ) {
        // Glow effect
        Box(
            modifier = Modifier
                .matchParentSize()
                .background(
                    brush = Brush.radialGradient(
                        colors = listOf(
                            neonCyan.copy(alpha = 0.1f),
                            Color.Transparent
                        )
                    ),
                    shape = RoundedCornerShape(16.dp)
                )
        )
        
        content()
    }
}
