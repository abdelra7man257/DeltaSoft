package com.example.data.datasource.contracts

import com.example.common.ResultWrapper
import com.example.domain.model.confirmorder.ConfirmOrderBody
import com.example.domain.model.confirmorder.ConfirmOrderResponse
import kotlinx.coroutines.flow.Flow

interface ConfirmOrderDataSource {
    suspend fun confirmOrder(confirmOrderBody: ConfirmOrderBody): Flow<ResultWrapper<ConfirmOrderResponse>>

}