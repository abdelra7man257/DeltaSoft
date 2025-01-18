package com.example.domain.model

import kotlinx.parcelize.Parcelize
import android.os.Parcelable

@Parcelize
data class AllOrders(
	val items: List<ItemsItem?>? = null,
	val itemsCount: Int? = null
) : Parcelable