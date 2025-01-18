package com.example.deltasoftandroidtask.common

import com.example.deltasoftandroidtask.common.exepctions.ServerError

sealed class UiState<out T> {
    data class Success<out T>(val data: T) : UiState<T>()
    data object Loading : UiState<Nothing>()
    data class ServerException(val serverError: ServerError) : UiState<Nothing>()
    data class Error(var error: Exception) : UiState<Nothing>()
}