package com.example.data.datasource.implementation.paging

import androidx.paging.PagingSource
import androidx.paging.PagingState
import com.example.data.datasource.contracts.AllOrdersDataSource
import com.example.data.models.allorders.AllOrdersBodyParamsDto
import com.example.domain.model.allorders.ItemsItem
import javax.inject.Inject

class AllOrdersPagingSource @Inject constructor(private val allOrdersDataSource: AllOrdersDataSource) :
    PagingSource<Int, ItemsItem>() {
    override fun getRefreshKey(state: PagingState<Int, ItemsItem>): Int? {
        return state.anchorPosition
    }

    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, ItemsItem> {

        return try {
            val currentPage = params.key ?: 1
            val allOrders =
                allOrdersDataSource.getAllOrdersWithPaging(AllOrdersBodyParamsDto().copy(pageNo = currentPage))

            return LoadResult.Page(
                data = allOrders,
                prevKey = if (currentPage == 1) null else currentPage - 1,
                nextKey = if (allOrders.isEmpty())null else currentPage + 1
            )
        } catch (e: Exception) {
            LoadResult.Error(e)
        }

    }
}