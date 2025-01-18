package com.example.data.datasource.contracts

import com.example.common.ResultWrapper
import com.example.domain.model.searchproductmodel.SearchProductBody
import com.example.domain.model.searchproductmodel.SearchProductResponseItem
import kotlinx.coroutines.flow.Flow

interface SearchProductDataSource {

    suspend fun searchProducts(serechProductBody: SearchProductBody): Flow<ResultWrapper<List<SearchProductResponseItem?>?>>
}