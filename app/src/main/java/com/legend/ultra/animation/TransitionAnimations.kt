package com.legend.ultra.animation

import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.tween
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.scale

fun Modifier.fadeInAnimation(): Modifier {
    return this
        .alpha(1f)
}

fun Modifier.scaleInAnimation(): Modifier {
    return this
        .scale(1f)
}

fun Modifier.slideInFromBottomAnimation(): Modifier {
    return this
}

fun Modifier.zoomInAnimation(scale: Float = 1.1f): Modifier {
    return this
        .scale(scale)
}
