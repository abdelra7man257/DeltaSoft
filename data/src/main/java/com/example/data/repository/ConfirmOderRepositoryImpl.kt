package com.example.data.repository

import com.example.common.ResultWrapper
import com.example.data.datasource.contracts.ConfirmOrderDataSource
import com.example.domain.model.confirmorder.ConfirmOrderBody
import com.example.domain.model.confirmorder.ConfirmOrderResponse
import com.example.domain.repository.contracts.ConfirmOrderRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class ConfirmOderRepositoryImpl  @Inject constructor(private val confirmOrderDataSource: ConfirmOrderDataSource):
    ConfirmOrderRepository
{
    override suspend fun confirmOrder(confirmOrderBody: ConfirmOrderBody): Flow<ResultWrapper<ConfirmOrderResponse>> {
        return confirmOrderDataSource.confirmOrder(confirmOrderBody)
    }
}