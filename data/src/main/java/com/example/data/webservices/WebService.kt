package com.example.data.webservices

import com.example.data.models.allorders.AllOrdersBodyParamsDto
import com.example.data.models.allorders.AllOrdersResponseDto
import com.example.data.models.searchproducts.SearchProductBodyParams
import com.example.data.models.searchproducts.SearchProductResponseDto
import retrofit2.http.Body
import retrofit2.http.POST

interface WebService {

    @POST("GetAllWithPaging")
    suspend fun getAllOrdersWithPaging(
        @Body allOrdersBodyParamsDto: AllOrdersBodyParamsDto
    ): AllOrdersResponseDto

    @POST("SearchProductsForCustomer")
    suspend fun searchProducts(
        @Body searchProductBody: SearchProductBodyParams
    ): List<SearchProductResponseDto?>?
}