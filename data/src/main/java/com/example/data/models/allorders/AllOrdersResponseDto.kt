package com.example.data.models.allorders

import com.example.domain.model.AllOrders
import com.google.gson.annotations.SerializedName

data class AllOrdersResponseDto(

	@field:SerializedName("items")
	val items: List<ItemsItemDto?>? = null,

	@field:SerializedName("itemsCount")
	val itemsCount: Int? = null
){
	fun toDomain(): AllOrders {
		return AllOrders(
			items = items?.map { it?.toDomain() },
			itemsCount = itemsCount
		)

	}
}