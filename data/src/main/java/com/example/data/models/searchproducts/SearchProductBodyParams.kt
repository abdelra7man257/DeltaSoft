package com.example.data.models.searchproducts

import com.google.gson.annotations.SerializedName

data class SearchProductBodyParams(

	@field:SerializedName("merchantId")
	val merchantId: String? = "8445bef7-af04-4707-a514-13636663fd5a",

	@field:SerializedName("name")
	val name: String? = "",

	@field:SerializedName("storeId")
	val storeId: Int? = 5
)
