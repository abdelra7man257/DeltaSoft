package com.example.data.datasource.di

import com.example.data.datasource.contracts.AllOrdersDataSource
import com.example.data.datasource.contracts.ConfirmOrderDataSource
import com.example.data.datasource.contracts.SearchProductDataSource
import com.example.data.datasource.implementation.AllOrderDataSourceImpl
import com.example.data.datasource.implementation.ConfirmOrderDataSourceImpl
import com.example.data.datasource.implementation.SearchProductsDataSourceImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
interface Di {
    @Binds
    fun bindAllOrdersDataSource(allOrderDataSourceImpl: AllOrderDataSourceImpl): AllOrdersDataSource

    @Binds
    fun bindSearchProductsData(searchProductsDataSourceImpl: SearchProductsDataSourceImpl): SearchProductDataSource

    @Binds
    fun bindConfirmOrderDataSource(confirmOrderDataSourceImpl: ConfirmOrderDataSourceImpl): ConfirmOrderDataSource


}