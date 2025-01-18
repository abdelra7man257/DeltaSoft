package com.example.data.models.allorders

import com.example.domain.model.Store
import com.google.gson.annotations.SerializedName

data class StoreDto(

    @field:SerializedName("code")
	val code: String? = null,

    @field:SerializedName("inventories")
	val inventories: List<InventoriesItemDto?>? = null,

    @field:SerializedName("name")
	val name: String? = null,

    @field:SerializedName("id")
	val id: Int? = null,

    @field:SerializedName("isActive")
	val isActive: Boolean? = null
){
  fun  toDomain(): Store {
        return Store(
            code = code,
            inventories = inventories?.map { it?.toDomain() },
            name = name,
            id = id,
            isActive = isActive

        )
    }
}