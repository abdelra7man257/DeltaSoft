package com.example.domain.usecase

import com.example.common.ResultWrapper
import com.example.domain.model.searchproductmodel.SearchProductBody
import com.example.domain.model.searchproductmodel.SearchProductResponseItem
import com.example.domain.repository.contracts.SearchProductRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class SearchProductsUseCase @Inject constructor(private val searchProductRepository: SearchProductRepository) {
    suspend operator fun invoke(searchProductBody: SearchProductBody): Flow<ResultWrapper<List<SearchProductResponseItem?>?>> {
        return searchProductRepository.searchProducts(searchProductBody)
    }

}