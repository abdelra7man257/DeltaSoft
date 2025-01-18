package com.example.data.models.allorders

import com.example.domain.model.ShippingAddressesItem
import com.google.gson.annotations.SerializedName

data class ShippingAddressesItemDto(

	@field:SerializedName("countryKey")
	val countryKey: String? = null,

	@field:SerializedName("cityName")
	val cityName: String? = null,

	@field:SerializedName("street")
	val street: String? = null,

	@field:SerializedName("postCode")
	val postCode: Any? = null,

	@field:SerializedName("telephone")
	val telephone: String? = null,

	@field:SerializedName("id")
	val id: Int? = null
){
	fun toDomain(): ShippingAddressesItem {
		return ShippingAddressesItem(
			countryKey = countryKey,
			cityName = cityName,
			street = street,
			postCode = postCode,
			telephone = telephone,
			id = id
		)
	}
}