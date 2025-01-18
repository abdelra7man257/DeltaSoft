package com.example.data.models.allorders

import com.example.domain.model.InventoriesItem
import com.google.gson.annotations.SerializedName

data class InventoriesItemDto(

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("id")
	val id: Int? = null
){
	fun toDomain(): InventoriesItem {
		return InventoriesItem(
			name = name,
			id = id
		)

	}
}