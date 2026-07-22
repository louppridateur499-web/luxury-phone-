package com.legend.ultra.performance

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

data class GamingModeState(
    val isEnabled: Boolean = false,
    val fpsLocked: Int = 120,
    val thermalLevel: Float = 0.5f,
    val batteryOptimization: Boolean = true,
    val cpuBoost: Float = 1.0f,
    val gpuBoost: Float = 1.0f
)

class GamingModeViewModel : ViewModel() {
    private val _gamingState = MutableStateFlow(GamingModeState())
    val gamingState: StateFlow<GamingModeState> = _gamingState
    
    fun enableGamingMode() {
        viewModelScope.launch {
            _gamingState.value = _gamingState.value.copy(
                isEnabled = true,
                fpsLocked = 120,
                cpuBoost = 1.5f,
                gpuBoost = 1.8f
            )
        }
    }
    
    fun disableGamingMode() {
        viewModelScope.launch {
            _gamingState.value = _gamingState.value.copy(
                isEnabled = false,
                cpuBoost = 1.0f,
                gpuBoost = 1.0f
            )
        }
    }
    
    fun setFPSLimit(fps: Int) {
        viewModelScope.launch {
            _gamingState.value = _gamingState.value.copy(fpsLocked = fps)
        }
    }
    
    fun updateThermalLevel(level: Float) {
        viewModelScope.launch {
            _gamingState.value = _gamingState.value.copy(thermalLevel = level)
        }
    }
}
