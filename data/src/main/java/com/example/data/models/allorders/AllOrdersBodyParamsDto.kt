package com.example.data.models.allorders

import com.google.gson.annotations.SerializedName


data class AllOrdersBodyParamsDto(

	@field:SerializedName("merchantId")
	val merchantId: String? = "8445bef7-af04-4707-a514-13636663fd5a",

	@field:SerializedName("pageNo")
	val pageNo: Int? = 1,

	@field:SerializedName("pageSize")
	val pageSize: Int? = 30,

	@field:SerializedName("storeId")
	val storeId: Int? = 5,

	@field:SerializedName("status")
	val status: Int? = 0
){

}

