package com.example.deltasoftandroidtask.ui.screens.neworderscreen.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.common.ResultWrapper
import com.example.domain.model.searchproductmodel.SearchProductBody
import com.example.domain.model.searchproductmodel.SearchProductResponseItem
import com.example.domain.usecase.SearchProductsUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class CreateNewOrderViewModel @Inject constructor(private val searchProductsUseCase: SearchProductsUseCase) :ViewModel() {


    private val _search = MutableStateFlow<ResultWrapper<List<SearchProductResponseItem?>?>>(ResultWrapper.Loading)
    val search get()  = _search

    init {
        searchProducts()
    }

    fun searchProducts(){
        viewModelScope.launch {
           searchProductsUseCase.invoke(searchProductBody = SearchProductBody()).collect{
               when(it){
                   is ResultWrapper.Error -> {
                       _search.value = ResultWrapper.Error(it.error)
                       Log.d("viewModel", "searchProducts: ${it.error}")

                   }
                   ResultWrapper.Loading -> {
                       _search.value = ResultWrapper.Loading
                       Log.d("viewModel", "searchProducts: Loading")
                   }
                   is ResultWrapper.ServerException -> {
                       _search.value = ResultWrapper.ServerException(it.serverError)
                       Log.d("viewModel", "searchProducts: ${it.serverError}")
                   }
                   is ResultWrapper.Success -> {
                       _search.value = ResultWrapper.Success(it.data)
                       Log.d("viewModel", "searchProducts: ${it.data}")
                   }
               }
           }


        }

    }
}