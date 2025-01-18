package com.example.data.repository

import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import com.example.data.datasource.contracts.AllOrdersDataSource
import com.example.data.datasource.implementation.AllOrdersPagingSource
import com.example.domain.model.AllOrders
import com.example.domain.model.AllOrdersBodyParams
import com.example.domain.model.ItemsItem
import com.example.domain.repository.contracts.AllOrdersRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class AllOrderRepositoryImpl @Inject constructor(private val allOrdersDataSource: AllOrdersDataSource) :
    AllOrdersRepository {
    override suspend fun getAllOrdersWithPaging(): Flow<PagingData<ItemsItem>> {
        return Pager(
            config = PagingConfig(pageSize = 30, prefetchDistance = 2),
            pagingSourceFactory = {
                AllOrdersPagingSource(allOrdersDataSource)
            }
        ).flow
    }
}