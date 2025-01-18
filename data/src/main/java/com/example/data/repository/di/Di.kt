package com.example.data.repository.di

import com.example.data.repository.AllOrderRepositoryImpl
import com.example.data.repository.SearchProductsRepositoryImpl
import com.example.domain.repository.contracts.AllOrdersRepository
import com.example.domain.repository.contracts.SearchProductRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
interface Di {

    @Binds
    fun bindAllOrdersRepository(allOrderRepositoryImpl: AllOrderRepositoryImpl): AllOrdersRepository

    @Binds
    fun bindSearchProductsRepository(searchProductsRepositoryImpl: SearchProductsRepositoryImpl): SearchProductRepository

}