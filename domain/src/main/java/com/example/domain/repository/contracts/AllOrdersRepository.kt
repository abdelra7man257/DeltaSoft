package com.example.domain.repository.contracts

import androidx.paging.PagingData
import com.example.domain.model.allorders.ItemsItem
import kotlinx.coroutines.flow.Flow

interface AllOrdersRepository {

    suspend fun getAllOrdersWithPaging(): Flow<PagingData<ItemsItem>>

}