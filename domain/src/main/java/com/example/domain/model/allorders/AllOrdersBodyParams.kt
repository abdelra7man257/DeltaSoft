package com.example.domain.model.allorders

import kotlinx.parcelize.Parcelize
import android.os.Parcelable

@Parcelize
data class AllOrdersBodyParams(
	val merchantId: String? = null,
	val pageNo: Int? = null,
	val pageSize: Int? = null,
	val storeId: Int? = null,
	val status: Int? = null
) : Parcelable