package com.legend.ultra.ui.lockscreen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.legend.ultra.animation.ParticleSystemBackground
import com.legend.ultra.ui.components.NeonText

@Composable
fun FuturisticLockScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                brush = Brush.verticalGradient(
                    colors = listOf(
                        Color(0xFF0A0E27),
                        Color(0xFF1A0F35)
                    )
                )
            )
    ) {
        // Particle background
        ParticleSystemBackground(
            modifier = Modifier.fillMaxSize(),
            particleCount = 30
        )
        
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(24.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = androidx.compose.foundation.layout.Arrangement.Center
        ) {
            // Time display
            NeonText(
                text = "23:45",
                style = androidx.compose.material3.MaterialTheme.typography.displayLarge,
                color = Color(0xFF00D9FF),
                isGlowing = true
            )
            
            Spacer(modifier = Modifier.height(16.dp))
            
            // Date display
            NeonText(
                text = "Tuesday, July 22, 2026",
                style = androidx.compose.material3.MaterialTheme.typography.bodyLarge,
                color = Color(0xFFB800E6),
                isGlowing = false
            )
            
            Spacer(modifier = Modifier.height(48.dp))
            
            // Unlock hint
            NeonText(
                text = "Swipe Up to Unlock",
                style = androidx.compose.material3.MaterialTheme.typography.bodyMedium,
                color = Color(0xFF00FF41),
                isGlowing = false
            )
        }
        
        // Bottom AI Assistant hint
        Box(
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .padding(24.dp)
        ) {
            NeonText(
                text = "Say \"Hey Legend\" for AI Assistant",
                style = androidx.compose.material3.MaterialTheme.typography.labelSmall,
                color = Color(0xFF00D9FF).copy(alpha = 0.6f),
                isGlowing = false
            )
        }
    }
}
