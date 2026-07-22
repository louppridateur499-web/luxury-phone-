package com.legend.ultra.animation

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.DrawScope
import kotlin.math.cos
import kotlin.math.sin
import kotlin.random.Random

data class Particle(
    val x: Float,
    val y: Float,
    val vx: Float,
    val vy: Float,
    val life: Float,
    val color: Color,
    val size: Float
)

@Composable
fun ParticleSystemBackground(
    modifier: Modifier = Modifier,
    particleCount: Int = 50
) {
    val particles = remember { mutableStateOf<List<Particle>>(emptyList()) }
    val animationProgress = remember { mutableStateOf(0f) }
    
    val progressAnim = animateFloatAsState(
        targetValue = 1f,
        animationSpec = tween(20000),
        label = "ParticleAnimation"
    )
    
    LaunchedEffect(Unit) {
        // Initialize particles
        val initialParticles = (0 until particleCount).map {
            val angle = Random.nextFloat() * 360f
            Particle(
                x = Random.nextFloat() * 1000f,
                y = Random.nextFloat() * 1000f,
                vx = cos(Math.toRadians(angle.toDouble())).toFloat() * 2f,
                vy = sin(Math.toRadians(angle.toDouble())).toFloat() * 2f,
                life = 1f,
                color = listOf(
                    Color(0xFF00D9FF),
                    Color(0xFFB800E6),
                    Color(0xFF00FF41)
                ).random(),
                size = Random.nextFloat() * 4f + 2f
            )
        }
        particles.value = initialParticles
    }
    
    Canvas(modifier = modifier.fillMaxSize()) {
        particles.value.forEach { particle ->
            drawCircle(
                color = particle.color.copy(alpha = particle.life),
                radius = particle.size,
                center = androidx.compose.ui.geometry.Offset(particle.x, particle.y)
            )
        }
    }
}
