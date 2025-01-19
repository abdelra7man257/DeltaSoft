package com.example.data.models.confirmorder

import com.example.domain.model.confirmorder.ConfirmOrderBody
import com.google.gson.annotations.SerializedName

data class ConfirmOrderBodyParam(

    @field:SerializedName("orderDetails")
    val orderDetails: List<OrderDetailsItem?>? = listOf(OrderDetailsItem()),

    @field:SerializedName("paymentDeliveryMethod")
    val paymentDeliveryMethod: Int? = 1,

    @field:SerializedName("postponedDate")
    val postponedDate: String? = "2024-09-23T13:13:46.063Z",

    @field:SerializedName("customerServiceUserId")
    val customerServiceUserId: String? = "c01282e4-7a03-424c-bbaa-c6df9c50af59",

    @field:SerializedName("customerId")
    val customerId: String? = "a8000b83-697b-47e6-abf6-f6bbea83d44a",

    @field:SerializedName("priceAfterDiscountTotal")
    val priceAfterDiscountTotal: Int? = 50,

    @field:SerializedName("orderDeliveryMethod")
    val orderDeliveryMethod: Int? = 1,

    @field:SerializedName("storeId")
    val storeId: Int? = 5,

    @field:SerializedName("addressId")
    val addressId: Int? = 227
) {
    fun toDomain(): ConfirmOrderBody {
        return ConfirmOrderBody(
            orderDetails = orderDetails?.map { it?.toDomain() },

            paymentDeliveryMethod = paymentDeliveryMethod,
            postponedDate,
            customerServiceUserId,
            customerId,
            priceAfterDiscountTotal,
            orderDeliveryMethod,
            storeId,
            addressId
        )
    }

	companion object{
		fun fromDomain(ConfirmOrderBody: ConfirmOrderBody): ConfirmOrderBodyParam
		{
			return ConfirmOrderBodyParam(
				orderDetails = ConfirmOrderBody.orderDetails?.map { OrderDetailsItem.fromDomain(it) },
				paymentDeliveryMethod = ConfirmOrderBody.paymentDeliveryMethod,
				postponedDate = ConfirmOrderBody.postponedDate,
				customerServiceUserId = ConfirmOrderBody.customerServiceUserId,
				customerId = ConfirmOrderBody.customerId,


			)
		}
	}
}

data class OrderDetailsItem(

    @field:SerializedName("quantity")
    val quantity: Double? = 1.25,

    @field:SerializedName("rowTotal")
    val rowTotal: Int? = null,

    @field:SerializedName("rowPriceAfterDiscount")
    val rowPriceAfterDiscount: Int? = 50,

    @field:SerializedName("porductId")
    val porductId: Int? = 240
) {
    fun toDomain(): com.example.domain.model.confirmorder.OrderDetailsItem {
        return com.example.domain.model.confirmorder.OrderDetailsItem(
            quantity = quantity,
            rowTotal = rowTotal,
            rowPriceAfterDiscount = rowPriceAfterDiscount,
            porductId = porductId
        )
    }
	companion object{
		fun fromDomain(orderDetailsItem: com.example.domain.model.confirmorder.OrderDetailsItem?): OrderDetailsItem  {
			return OrderDetailsItem(
				quantity = orderDetailsItem?.quantity,
				rowTotal = orderDetailsItem?.rowTotal,
				rowPriceAfterDiscount = orderDetailsItem?.rowPriceAfterDiscount,
				porductId = orderDetailsItem?.porductId
			)
		}
	}
}
