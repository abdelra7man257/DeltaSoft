package com.example.domain.model.allorders

import kotlinx.parcelize.Parcelize
import android.os.Parcelable

@Parcelize
data class ItemsItem(
    val orderNumber: String? = null,
    val postponedDate: String? = null,
    val discountAmount: Int? = null,
    val startCompleteDate: String? = null,
    val updatedDate: String? = null,
    val inventory: Inventory? = null,
    val purchasePoint: Int? = null,
    val startShippingDate: String? = null,
    val merchantId: String? = null,
    val fromPos: Boolean? = null,
    val totalRefunded: Int? = null,
    val shippingAmount: Double? = null,
    val id: Int? = null,
    val customerUser: CustomerUser? = null,
    val grandTotal: Int? = null,
    val shippingMethod: Int? = null,
    val createdDate: String? = null,
    val priceAfterDiscountTotal: Int? = null,
    val paymentMethod: Int? = null,
    val syncSucceed: Boolean? = null,
    val status: Int? = null,
    val shippingAddresses: List<ShippingAddressesItem?>? = null
) : Parcelable