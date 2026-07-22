package com.legend.ultra.ai

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

data class AIState(
    val isListening: Boolean = false,
    val currentCommand: String = "",
    val response: String = "",
    val isProcessing: Boolean = false
)

class AIAssistantViewModel : ViewModel() {
    private val _uiState = MutableStateFlow(AIState())
    val uiState: StateFlow<AIState> = _uiState
    
    fun startListening() {
        viewModelScope.launch {
            _uiState.value = _uiState.value.copy(isListening = true)
        }
    }
    
    fun stopListening() {
        viewModelScope.launch {
            _uiState.value = _uiState.value.copy(isListening = false)
        }
    }
    
    fun processCommand(command: String) {
        viewModelScope.launch {
            _uiState.value = _uiState.value.copy(
                isProcessing = true,
                currentCommand = command
            )
            
            // Simulate AI processing
            val response = generateAIResponse(command)
            
            _uiState.value = _uiState.value.copy(
                response = response,
                isProcessing = false
            )
        }
    }
    
    private suspend fun generateAIResponse(command: String): String {
        return when {
            command.contains("call", ignoreCase = true) -> "Calling contact..."
            command.contains("message", ignoreCase = true) -> "Sending message..."
            command.contains("app", ignoreCase = true) -> "Opening app..."
            command.contains("weather", ignoreCase = true) -> "Checking weather..."
            command.contains("time", ignoreCase = true) -> "Current time is 23:45"
            else -> "Command recognized. Processing..."
        }
    }
}
