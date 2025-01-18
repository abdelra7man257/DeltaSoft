package com.example.data.repository

import com.example.data.datasource.contracts.SearchProductDataSource
import com.example.common.ResultWrapper
import com.example.domain.model.searchproductmodel.SearchProductBody
import com.example.domain.model.searchproductmodel.SearchProductResponseItem
import com.example.domain.repository.contracts.SearchProductRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class SearchProductsRepositoryImpl @Inject constructor(private val searchProductDataSource: SearchProductDataSource):SearchProductRepository {
    override suspend fun searchProducts(searchProductBody: SearchProductBody): Flow<ResultWrapper<List<SearchProductResponseItem?>?>> {
        return searchProductDataSource.searchProducts(searchProductBody)
    }
}