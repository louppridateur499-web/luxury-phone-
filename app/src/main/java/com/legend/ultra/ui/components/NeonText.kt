package com.legend.ultra.ui.components

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun NeonText(
    text: String,
    modifier: Modifier = Modifier,
    style: TextStyle = TextStyle(fontSize = 16.sp),
    color: Color = Color(0xFF00D9FF),
    isGlowing: Boolean = true
) {
    if (isGlowing) {
        // Glow layer
        Text(
            text = text,
            modifier = modifier
                .blur(8.dp),
            style = style.copy(
                brush = Brush.linearGradient(
                    colors = listOf(color.copy(alpha = 0.6f), color.copy(alpha = 0.2f))
                )
            )
        )
    }
    
    // Main text
    Text(
        text = text,
        modifier = modifier,
        style = style.copy(color = color)
    )
}
