package com.example.data.datasource.contracts

import com.example.data.models.allorders.AllOrdersBodyParamsDto
import com.example.domain.model.allorders.ItemsItem

interface AllOrdersDataSource  {

    suspend fun getAllOrdersWithPaging(allOrdersBodyParamsDto: AllOrdersBodyParamsDto): List<ItemsItem>
}