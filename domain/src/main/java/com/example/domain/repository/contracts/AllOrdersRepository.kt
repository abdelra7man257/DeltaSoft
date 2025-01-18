package com.example.domain.repository.contracts

import androidx.paging.PagingData
import com.example.domain.model.AllOrders
import com.example.domain.model.AllOrdersBodyParams
import com.example.domain.model.ItemsItem
import kotlinx.coroutines.flow.Flow

interface AllOrdersRepository {

    suspend fun getAllOrdersWithPaging(): Flow<PagingData<ItemsItem>>

}