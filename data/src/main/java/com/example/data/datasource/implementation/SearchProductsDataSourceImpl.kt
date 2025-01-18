package com.example.data.datasource.implementation

import com.example.data.apimodule.common.safeApiCall
import com.example.data.datasource.contracts.SearchProductDataSource
import com.example.data.webservices.WebService
import com.example.common.ResultWrapper
import com.example.data.models.searchproducts.SearchProductBodyParams
import com.example.domain.model.searchproductmodel.SearchProductBody
import com.example.domain.model.searchproductmodel.SearchProductResponseItem
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class SearchProductsDataSourceImpl @Inject constructor(private val apiService: WebService) :SearchProductDataSource {
    override suspend fun searchProducts(serechProductBody: SearchProductBody): Flow<ResultWrapper<List<SearchProductResponseItem?>?>> {
       return safeApiCall { apiService.searchProducts(searchProductBody = SearchProductBodyParams())?.map { it?.toDomain() } }
    }
}