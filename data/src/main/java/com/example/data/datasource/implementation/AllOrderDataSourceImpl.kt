package com.example.data.datasource.implementation

import com.example.data.datasource.contracts.AllOrdersDataSource
import com.example.data.models.allorders.AllOrdersBodyParamsDto
import com.example.data.webservices.WebService
import com.example.domain.model.allorders.ItemsItem
import javax.inject.Inject

class AllOrderDataSourceImpl @Inject constructor(private val apiService: WebService) :
    AllOrdersDataSource {
    override suspend fun getAllOrdersWithPaging(allOrdersBodyParamsDto: AllOrdersBodyParamsDto):List<ItemsItem>  {
        return apiService.getAllOrdersWithPaging(allOrdersBodyParamsDto).items?.map { it?.toDomain()!! }?: emptyList()
    }

}