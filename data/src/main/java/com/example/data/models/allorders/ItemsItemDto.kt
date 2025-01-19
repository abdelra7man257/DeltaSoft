package com.example.data.models.allorders

import com.example.domain.model.allorders.ItemsItem
import com.google.gson.annotations.SerializedName

data class ItemsItemDto(

	@field:SerializedName("orderNumber")
	val orderNumber: String? = null,

	@field:SerializedName("postponedDate")
	val postponedDate: String? = null,

	@field:SerializedName("discountAmount")
	val discountAmount: Int? = null,

	@field:SerializedName("startCompleteDate")
	val startCompleteDate: Any? = null,

	@field:SerializedName("updatedDate")
	val updatedDate: Any? = null,

	@field:SerializedName("preparingOrderEmployeeUser")
	val preparingOrderEmployeeUser: Any? = null,

	@field:SerializedName("inventory")
	val inventory: InventoryDto? = null,

	@field:SerializedName("purchasePoint")
	val purchasePoint: Int? = null,

	@field:SerializedName("startShippingDate")
	val startShippingDate: Any? = null,

	@field:SerializedName("idOnline")
	val idOnline: Any? = null,

	@field:SerializedName("merchantId")
	val merchantId: String? = null,

	@field:SerializedName("operationNumber")
	val operationNumber: Any? = null,

	@field:SerializedName("fromPos")
	val fromPos: Boolean? = null,

	@field:SerializedName("totalRefunded")
	val totalRefunded: Int? = null,

	@field:SerializedName("shippingAmount")
	val shippingAmount: Any? = null,

	@field:SerializedName("id")
	val id: Int? = null,

	@field:SerializedName("cashierUser")
	val cashierUser: Any? = null,

	@field:SerializedName("customerServiceComment")
	val customerServiceComment: Any? = null,

	@field:SerializedName("serviceFee")
	val serviceFee: Any? = null,

	@field:SerializedName("customerUser")
	val customerUser: CustomerUserDto? = null,

	@field:SerializedName("grandTotal")
	val grandTotal: Int? = null,

	@field:SerializedName("shippingMethod")
	val shippingMethod: Int? = null,

	@field:SerializedName("customerServiceUser")
	val customerServiceUser: Any? = null,

	@field:SerializedName("createdDate")
	val createdDate: String? = null,

	@field:SerializedName("cashierComment")
	val cashierComment: Any? = null,

	@field:SerializedName("priceAfterDiscountTotal")
	val priceAfterDiscountTotal: Int? = null,

	@field:SerializedName("paymentMethod")
	val paymentMethod: Int? = null,

	@field:SerializedName("deliveryUser")
	val deliveryUser: Any? = null,

	@field:SerializedName("syncSucceed")
	val syncSucceed: Boolean? = null,

	@field:SerializedName("couponCode")
	val couponCode: Any? = null,

	@field:SerializedName("status")
	val status: Int? = null,

	@field:SerializedName("shippingAddresses")
	val shippingAddresses: List<ShippingAddressesItemDto?>? = null
){
	fun toDomain(): ItemsItem {
		return ItemsItem(
			orderNumber = orderNumber,
			postponedDate = postponedDate,
			discountAmount = discountAmount,
			startCompleteDate = startCompleteDate.toString(),
			updatedDate = updatedDate.toString(),
			inventory = inventory?.toDomain(),
			purchasePoint = purchasePoint,
			startShippingDate = startShippingDate.toString(),
			merchantId = merchantId,
			fromPos = fromPos,
			totalRefunded = totalRefunded,
			shippingAmount = shippingAmount.toString().toDouble(),
			id = id,
			customerUser = customerUser?.toDomain(),

			grandTotal = grandTotal,
			shippingMethod = shippingMethod,
			createdDate = createdDate,
			priceAfterDiscountTotal = priceAfterDiscountTotal,
			paymentMethod = paymentMethod,
			syncSucceed = syncSucceed,
			status = status,
			shippingAddresses = shippingAddresses?.map { it?.toDomain() }
		)


	}
}