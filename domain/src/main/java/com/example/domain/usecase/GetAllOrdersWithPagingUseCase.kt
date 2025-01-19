package com.example.domain.usecase

import com.example.domain.repository.contracts.AllOrdersRepository
import javax.inject.Inject

class GetAllOrdersWithPagingUseCase @Inject constructor(private val allOrdersRepository: AllOrdersRepository) {
    suspend operator fun invoke() =
        allOrdersRepository.getAllOrdersWithPaging()

}