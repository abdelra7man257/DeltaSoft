package com.example.domain.repository.contracts

import com.example.common.ResultWrapper
import com.example.domain.model.confirmorder.ConfirmOrderBody
import com.example.domain.model.confirmorder.ConfirmOrderResponse
import kotlinx.coroutines.flow.Flow

interface ConfirmOrderRepository {

    suspend fun confirmOrder(confirmOrderBody: ConfirmOrderBody): Flow<ResultWrapper<ConfirmOrderResponse>>
}