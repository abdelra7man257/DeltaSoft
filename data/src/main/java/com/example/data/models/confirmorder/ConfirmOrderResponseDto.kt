package com.example.data.models.confirmorder

import com.example.domain.model.confirmorder.ConfirmOrderResponse
import com.google.gson.annotations.SerializedName

data class ConfirmOrderResponseDto(

	@field:SerializedName("priceAfterDiscountTotal")
	val priceAfterDiscountTotal: Int? = null,

	@field:SerializedName("id")
	val id: Int? = null,

	@field:SerializedName("barcode")
	val barcode: String? = null
){
	fun toDomain(): ConfirmOrderResponse {
		return ConfirmOrderResponse(
			priceAfterDiscountTotal = priceAfterDiscountTotal,
			id = id,
			barcode = barcode
		)
	}

	companion object{
		fun fromDomain(confirmOrderResponse: ConfirmOrderResponse): ConfirmOrderResponseDto {
			return ConfirmOrderResponseDto(
				priceAfterDiscountTotal = confirmOrderResponse.priceAfterDiscountTotal,
				id = confirmOrderResponse.id,
				barcode = confirmOrderResponse.barcode
			)
			}
	}
}
