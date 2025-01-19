package com.example.domain.model.confirmorder

import kotlinx.parcelize.Parcelize
import android.os.Parcelable

@Parcelize
data class ConfirmOrderResponse(
	val priceAfterDiscountTotal: Int? = null,
	val id: Int? = null,
	val barcode: String? = null
) : Parcelable
