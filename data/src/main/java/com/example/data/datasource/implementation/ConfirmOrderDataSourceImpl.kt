package com.example.data.datasource.implementation

import com.example.common.ResultWrapper
import com.example.data.apimodule.common.safeApiCall
import com.example.data.datasource.contracts.ConfirmOrderDataSource
import com.example.data.models.confirmorder.ConfirmOrderBodyParam
import com.example.data.models.confirmorder.ConfirmOrderResponseDto
import com.example.data.webservices.WebService
import com.example.domain.model.confirmorder.ConfirmOrderBody
import com.example.domain.model.confirmorder.ConfirmOrderResponse
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class ConfirmOrderDataSourceImpl @Inject constructor(private val webService: WebService):
    ConfirmOrderDataSource {
    override suspend fun confirmOrder(confirmOrderBody: ConfirmOrderBody): Flow<ResultWrapper<ConfirmOrderResponse>> {
        return safeApiCall {
            webService.confirmOrder(confirmOrderBody = ConfirmOrderBodyParam.fromDomain(confirmOrderBody)).toDomain()
        }
    }

}