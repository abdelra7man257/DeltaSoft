package com.example.domain.model

import kotlinx.parcelize.Parcelize
import android.os.Parcelable
import kotlinx.parcelize.RawValue

@Parcelize
data class ShippingAddressesItem(
	val countryKey: String? = null,
	val cityName: String? = null,
	val street: String? = null,
	val postCode:@RawValue Any? = null,
	val telephone: String? = null,
	val id: Int? = null
) : Parcelable