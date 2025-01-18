package com.example.deltasoftandroidtask.ui.screens.homescreen.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.PagingData
import androidx.paging.cachedIn
import com.example.deltasoftandroidtask.common.UiState
import com.example.domain.model.ItemsItem
import com.example.domain.usecase.GetAllOrdersWithPagingUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.distinctUntilChanged
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeScreenViewModel @Inject constructor( private val getAllOrdersWithPagingUseCase: GetAllOrdersWithPagingUseCase) : ViewModel()  {

    init {
        getAllOrderWithPaging()
    }

    private val _orderStateFlow = MutableStateFlow<PagingData<ItemsItem>>(PagingData.empty())
    val orderStateFlow get() =  _orderStateFlow

    fun getAllOrderWithPaging() {
        viewModelScope.launch {
            try {
                getAllOrdersWithPagingUseCase.invoke()
                    .distinctUntilChanged()
                    .cachedIn(viewModelScope)
                    .collect {
                        _orderStateFlow.emit(it)
                    }
            }catch (e: Exception){
//                _orderStateFlow.emit(e)
            }
        }
    }
}