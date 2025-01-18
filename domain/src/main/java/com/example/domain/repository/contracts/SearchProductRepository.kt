package com.example.domain.repository.contracts

import com.example.common.ResultWrapper
import com.example.domain.model.searchproductmodel.SearchProductBody
import com.example.domain.model.searchproductmodel.SearchProductResponseItem
import kotlinx.coroutines.flow.Flow

interface SearchProductRepository {

    suspend fun searchProducts(searchProductBody: SearchProductBody): Flow<ResultWrapper<List<SearchProductResponseItem?>?>>
}