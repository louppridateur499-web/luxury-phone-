package com.legend.ultra.widgets

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.legend.ultra.ui.components.HolographicCard

@Composable
fun WeatherWidget(modifier: Modifier = Modifier) {
    HolographicCard(modifier = modifier) {
        Column(
            modifier = Modifier
                .padding(16.dp)
        ) {
            Text(
                text = "Weather",
                style = MaterialTheme.typography.labelSmall,
                color = Color(0xFF00D9FF)
            )
            Text(
                text = "23°C • Sunny",
                style = MaterialTheme.typography.bodyMedium,
                color = Color(0xFFB800E6)
            )
        }
    }
}

@Composable
fun BatteryWidget(modifier: Modifier = Modifier) {
    HolographicCard(modifier = modifier) {
        Column(
            modifier = Modifier
                .padding(16.dp)
        ) {
            Text(
                text = "Battery",
                style = MaterialTheme.typography.labelSmall,
                color = Color(0xFF00D9FF)
            )
            Text(
                text = "85%",
                style = MaterialTheme.typography.bodyMedium,
                color = Color(0xFF00FF41)
            )
        }
    }
}

@Composable
fun CalendarWidget(modifier: Modifier = Modifier) {
    HolographicCard(modifier = modifier) {
        Column(
            modifier = Modifier
                .padding(16.dp)
        ) {
            Text(
                text = "Calendar",
                style = MaterialTheme.typography.labelSmall,
                color = Color(0xFF00D9FF)
            )
            Text(
                text = "3 Events Today",
                style = MaterialTheme.typography.bodyMedium,
                color = Color(0xFFB800E6)
            )
        }
    }
}
