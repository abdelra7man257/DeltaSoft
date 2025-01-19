package com.example.deltasoftandroidtask.ui.screens.confirmorderscreen.viewmodel

import androidx.lifecycle.ViewModel
import com.example.common.ResultWrapper
import com.example.domain.model.confirmorder.ConfirmOrderBody
import com.example.domain.model.confirmorder.ConfirmOrderResponse
import com.example.domain.usecase.ConfirmOrderUseCase
import kotlinx.coroutines.flow.MutableStateFlow
import javax.inject.Inject

class ConfirmOrderViewModel @Inject constructor(private val confirmOrderUseCase: ConfirmOrderUseCase) : ViewModel() {


    private val _state = MutableStateFlow<ResultWrapper<ConfirmOrderResponse>>(ResultWrapper.Loading)

    suspend fun confirmOrder(confirmOrderBody: ConfirmOrderBody) {
        confirmOrderUseCase.invoke(confirmOrderBody).collect {
           when(it)
           {
               is ResultWrapper.Success -> {
                   _state.value = ResultWrapper.Success(it.data)
               }
               is ResultWrapper.Error -> {
                   _state.value = ResultWrapper.Error(it.error)
                   }
               is ResultWrapper.Loading -> {
                   _state.value = ResultWrapper.Loading
               }
               else -> {}
           }
        }
    }


}