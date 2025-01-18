package com.example.domain.model.searchproductmodel

import kotlinx.parcelize.Parcelize
import android.os.Parcelable

@Parcelize
data class SearchProductBody(
	val merchantId: String? = "8445bef7-af04-4707-a514-13636663fd5a",
	val name: String? = "",
	val storeId: Int? = 5
) : Parcelable
