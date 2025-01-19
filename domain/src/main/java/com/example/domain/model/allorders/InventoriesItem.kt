package com.example.domain.model.allorders

import kotlinx.parcelize.Parcelize
import android.os.Parcelable

@Parcelize
data class InventoriesItem(
	val name: String? = null,
	val id: Int? = null
) : Parcelable