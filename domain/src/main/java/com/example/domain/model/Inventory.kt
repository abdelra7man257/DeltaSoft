package com.example.domain.model

import kotlinx.parcelize.Parcelize
import android.os.Parcelable

@Parcelize
data class Inventory(
	val name: String? = null,
	val id: Int? = null,
	val store: Store? = null,
	val storeId: Int? = null
) : Parcelable