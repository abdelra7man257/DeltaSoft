package com.example.domain.model.allorders

import kotlinx.parcelize.Parcelize
import android.os.Parcelable
import kotlinx.parcelize.RawValue

@Parcelize
data class CustomerUser(
	val city: String? = null,
	val displayName: String? = null,
	val subDomain: String? = null,
	val password: String? = null,
	val defaultCustomer: String? = null,
	val merchantId:@RawValue Any? = null,
	val subtype: @RawValue Any? = null,
	val street:@RawValue Any? = null,
	val countryCode:@RawValue Any? = null,
	val stockID:@RawValue Any? = null,
	val subscripeDate:@RawValue Any? = null,
	val id:@RawValue String? = null,
	val isCompletProfile:@RawValue Boolean? = null,
	val merchantType:@RawValue Any? = null,
	val storeCode:@RawValue Any? = null,
	val storeType:@RawValue Any? = null,
	val verifiedType:@RawValue Int? = null,
	val storeId:@RawValue Any? = null,
	val userName:@RawValue String? = null,
	val token:@RawValue Any? = null,
	val organizationType:@RawValue Any? = null,
	val userRoles:@RawValue List<Any?>? = null,
	val isPaid:@RawValue Any? = null,
	val tokenExpireDate:@RawValue Any? = null,
	val merchantRefNumber:@RawValue Any? = null,
	val paymentMethod:@RawValue Any? = null
) : Parcelable