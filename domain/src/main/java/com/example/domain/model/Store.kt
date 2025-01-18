package com.example.domain.model

import kotlinx.parcelize.Parcelize
import android.os.Parcelable

@Parcelize
data class Store(
	val code: String? = null,
	val inventories: List<InventoriesItem?>? = null,
	val name: String? = null,
	val id: Int? = null,
	val isActive: Boolean? = null
) : Parcelable