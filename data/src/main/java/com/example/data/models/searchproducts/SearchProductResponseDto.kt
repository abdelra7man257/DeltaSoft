package com.example.data.models.searchproducts

import com.example.domain.model.searchproductmodel.Category
import com.example.domain.model.searchproductmodel.MerchantProductsItem
import com.example.domain.model.searchproductmodel.ProductCategoriesItem
import com.example.domain.model.searchproductmodel.ProductInvetoriesItem
import com.example.domain.model.searchproductmodel.SearchProductResponseItem
import com.google.gson.annotations.SerializedName



data class ProductCategoriesItemDto(

	@field:SerializedName("productId")
	val productId: Int? = null,

	@field:SerializedName("rank")
	val rank: Int? = null,

	@field:SerializedName("category")
	val category: CategoryDto? = null,

	@field:SerializedName("categoryId")
	val categoryId: Int? = null
){
	fun toDomain(): ProductCategoriesItem {
		return ProductCategoriesItem(
			productId = productId,
			rank = rank,
			category = category?.toDomain(),
			categoryId = categoryId
		)
	}
}

data class ProductInvetoriesItemDto(

	@field:SerializedName("quantity")
	val quantity: Any? = null,

	@field:SerializedName("productId")
	val productId: Int? = null,

	@field:SerializedName("price")
	val price: Double? = null,

	@field:SerializedName("salableQuantity")
	val salableQuantity: Any? = null,

	@field:SerializedName("inventoryId")
	val inventoryId: Int? = null,

	@field:SerializedName("id")
	val id: Int? = null,

	@field:SerializedName("priceAfterDiscount")
	val priceAfterDiscount: Double? = null,

	@field:SerializedName("status")
	val status: Boolean? = null
){
	fun toDomain(): ProductInvetoriesItem {
		return ProductInvetoriesItem(
			quantity = quantity.toString(),
			productId = productId,
			price = price?.toInt(),
			salableQuantity = salableQuantity.toString(),
			inventoryId = inventoryId,
			id = id,
			priceAfterDiscount = priceAfterDiscount,
			status = status
		)
	}
}

data class MerchantProductsItemDto(

	@field:SerializedName("maxQuantity")
	val maxQuantity: Int? = null,

	@field:SerializedName("additionalBarcode")
	val additionalBarcode: Any? = null,

	@field:SerializedName("isOffer")
	val isOffer: Boolean? = null,

	@field:SerializedName("productApprovalStatus")
	val productApprovalStatus: Int? = null,

	@field:SerializedName("description")
	val description: String? = null,

	@field:SerializedName("dateFrom")
	val dateFrom: String? = null,

	@field:SerializedName("productApparence")
	val productApparence: Int? = null,

	@field:SerializedName("alwaysAvailable")
	val alwaysAvailable: Boolean? = null,

	@field:SerializedName("price")
	val price: Double? = null,

	@field:SerializedName("dateTo")
	val dateTo: String? = null,

	@field:SerializedName("isMostUsed")
	val isMostUsed: Boolean? = null,

	@field:SerializedName("childQuantity")
	val childQuantity: Any? = null,

	@field:SerializedName("priceAfterDiscount")
	val priceAfterDiscount: Double? = null,

	@field:SerializedName("initialValue")
	val initialValue: Any? = null,

	@field:SerializedName("status")
	val status: Int? = null
){
	fun toDomain(): MerchantProductsItem {
		return MerchantProductsItem(
			maxQuantity = maxQuantity,
			additionalBarcode = additionalBarcode.toString(),

			isOffer = isOffer,
			productApprovalStatus = productApprovalStatus,

			description = description,
			dateFrom = dateFrom,
			productApparence = productApparence,
			alwaysAvailable = alwaysAvailable,
			price = price?.toInt(),
			dateTo = dateTo,
			isMostUsed = isMostUsed,
			childQuantity = childQuantity.toString(),
			priceAfterDiscount = priceAfterDiscount,
			initialValue = initialValue.toString(),
			status = status
		)
	}
}

data class SearchProductResponseDto(

	@field:SerializedName("image")
	val image: String? = null,

	@field:SerializedName("isAvailable")
	val isAvailable: Boolean? = null,

	@field:SerializedName("additionalBarcode")
	val additionalBarcode: Any? = null,

	@field:SerializedName("merchantProducts")
	val merchantProducts: List<MerchantProductsItemDto?>? = null,

	@field:SerializedName("subCategoryId")
	val subCategoryId: Int? = null,

	@field:SerializedName("barCode")
	val barCode: String? = null,

	@field:SerializedName("alwaysAvailable")
	val alwaysAvailable: Boolean? = null,

	@field:SerializedName("productCategories")
	val productCategories: List<ProductCategoriesItemDto?>? = null,

	@field:SerializedName("price")
	val price: Double? = null,

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("salableQuantity")
	val salableQuantity: Any? = null,

	@field:SerializedName("childQuantity")
	val childQuantity: Any? = null,

	@field:SerializedName("id")
	val id: Int? = null,

	@field:SerializedName("sku")
	val sku: String? = null,

	@field:SerializedName("priceAfterDiscount")
	val priceAfterDiscount: Double? = null,

	@field:SerializedName("productInvetories")
	val productInvetories: List<ProductInvetoriesItemDto?>? = null,

	@field:SerializedName("productType")
	val productType: Int? = null
){
	fun toDomain(): SearchProductResponseItem {
		return SearchProductResponseItem(

			image = image,
			isAvailable = isAvailable,

			additionalBarcode = additionalBarcode.toString(),
			subCategoryId = subCategoryId,

			barCode = barCode,
			alwaysAvailable = alwaysAvailable,
			price = price?.toInt(),
			name = name,
			salableQuantity = salableQuantity.toString(),

			childQuantity = childQuantity.toString(),
			id = id,
			sku = sku,
			priceAfterDiscount = priceAfterDiscount,
			productType = productType,
			merchantProducts = merchantProducts?.map { it?.toDomain() },
			productCategories = productCategories?.map { it?.toDomain() },
			productInvetories = productInvetories?.map { it?.toDomain() }
		)
	}
}

data class CategoryDto(

	@field:SerializedName("image")
	val image: String? = null,

	@field:SerializedName("name_Fr")
	val nameFr: String? = null,

	@field:SerializedName("merchantId")
	val merchantId: String? = null,

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("minSaleQty")
	val minSaleQty: Int? = null,

	@field:SerializedName("rank")
	val rank: Int? = null,

	@field:SerializedName("parentCategoryId")
	val parentCategoryId: Int? = null,

	@field:SerializedName("id")
	val id: Int? = null,

	@field:SerializedName("isActive")
	val isActive: Boolean? = null,

	@field:SerializedName("name_En")
	val nameEn: String? = null
){
	fun toDomain(): Category {
		return Category(

			image = image,
			nameFr = nameFr,
			merchantId = merchantId,

			name = name,
			minSaleQty = minSaleQty,
			rank = rank,
			parentCategoryId = parentCategoryId,
			id = id,
			isActive = isActive,
			nameEn = nameEn
		)
	}
}
