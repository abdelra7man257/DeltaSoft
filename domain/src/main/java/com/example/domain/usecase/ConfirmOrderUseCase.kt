package com.example.domain.usecase

import com.example.domain.model.confirmorder.ConfirmOrderBody
import com.example.domain.model.confirmorder.ConfirmOrderResponse
import com.example.domain.repository.contracts.ConfirmOrderRepository
import javax.inject.Inject

class ConfirmOrderUseCase
@Inject constructor(private val confirmOrderRepository: ConfirmOrderRepository) {
    suspend operator fun invoke(confirmOrderBody: ConfirmOrderBody) = confirmOrderRepository.confirmOrder(confirmOrderBody)

}