package com.example.data.models.allorders

import com.example.domain.model.allorders.Inventory
import com.google.gson.annotations.SerializedName

data class InventoryDto(

    @field:SerializedName("name")
	val name: String? = null,

    @field:SerializedName("id")
	val id: Int? = null,

    @field:SerializedName("store")
	val store: StoreDto? = null,

    @field:SerializedName("storeId")
	val storeId: Int? = null
){
    fun toDomain(): Inventory {
        return Inventory(
            name = name,
            id = id,
            store = store?.toDomain(),
            storeId = storeId
        )
    }
}