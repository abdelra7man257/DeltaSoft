package com.example.domain.model.confirmorder

import kotlinx.parcelize.Parcelize
import android.os.Parcelable

@Parcelize
data class ConfirmOrderBody(
	val orderDetails: List<OrderDetailsItem?>? = null,
	val paymentDeliveryMethod: Int? = null,
	val postponedDate: String? = null,
	val customerServiceUserId: String? = null,
	val customerId: String? = null,
	val priceAfterDiscountTotal: Int? = null,
	val orderDeliveryMethod: Int? = null,
	val storeId: Int? = null,
	val addressId: Int? = null
) : Parcelable

@Parcelize
data class OrderDetailsItem(
	val quantity: Double? = null,
	val rowTotal: Int? = null,
	val rowPriceAfterDiscount: Int? = null,
	val porductId: Int? = null
) : Parcelable
