package com.example.data.models.allorders

import com.google.gson.annotations.SerializedName

data class CustomerServiceUserDto(

	@field:SerializedName("city")
	val city: Any? = null,

	@field:SerializedName("displayName")
	val displayName: String? = null,

	@field:SerializedName("subDomain")
	val subDomain: Any? = null,

	@field:SerializedName("password")
	val password: Any? = null,

	@field:SerializedName("default_customer")
	val defaultCustomer: Any? = null,

	@field:SerializedName("merchantId")
	val merchantId: String? = null,

	@field:SerializedName("subtype")
	val subtype: Any? = null,

	@field:SerializedName("street")
	val street: Any? = null,

	@field:SerializedName("countryCode")
	val countryCode: Any? = null,

	@field:SerializedName("stockID")
	val stockID: Any? = null,

	@field:SerializedName("subscripeDate")
	val subscripeDate: Any? = null,

	@field:SerializedName("id")
	val id: String? = null,

	@field:SerializedName("isCompletProfile")
	val isCompletProfile: Boolean? = null,

	@field:SerializedName("merchantType")
	val merchantType: Any? = null,

	@field:SerializedName("store_code")
	val storeCode: Any? = null,

	@field:SerializedName("storeType")
	val storeType: Any? = null,

	@field:SerializedName("verifiedType")
	val verifiedType: Int? = null,

	@field:SerializedName("storeId")
	val storeId: Any? = null,

	@field:SerializedName("userName")
	val userName: String? = null,

	@field:SerializedName("token")
	val token: Any? = null,

	@field:SerializedName("organizationType")
	val organizationType: Any? = null,

	@field:SerializedName("userRoles")
	val userRoles: List<Any?>? = null,

	@field:SerializedName("isPaid")
	val isPaid: Any? = null,

	@field:SerializedName("tokenExpireDate")
	val tokenExpireDate: Any? = null,

	@field:SerializedName("merchantRefNumber")
	val merchantRefNumber: Any? = null,

	@field:SerializedName("paymentMethod")
	val paymentMethod: Any? = null
)