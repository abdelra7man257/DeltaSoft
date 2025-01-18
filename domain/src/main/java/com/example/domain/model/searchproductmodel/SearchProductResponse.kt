package com.example.domain.model.searchproductmodel

import kotlinx.parcelize.Parcelize
import android.os.Parcelable



@Parcelize
data class MerchantProductsItem(
	val maxQuantity: Int? = null,
	val additionalBarcode: String? = null,
	val isOffer: Boolean? = null,
	val productApprovalStatus: Int? = null,
	val description: String? = null,
	val dateFrom: String? = null,
	val productApparence: Int? = null,
	val alwaysAvailable: Boolean? = null,
	val price: Int? = null,
	val dateTo: String? = null,
	val isMostUsed: Boolean? = null,
	val childQuantity: String? = null,
	val priceAfterDiscount: Double? = null,
	val initialValue: String? = null,
	val status: Int? = null
) : Parcelable

@Parcelize
data class Category(
	val image: String? = null,
	val nameFr: String? = null,
	val merchantId: String? = null,
	val name: String? = null,
	val minSaleQty: Int? = null,
	val rank: Int? = null,
	val parentCategoryId: Int? = null,
	val id: Int? = null,
	val isActive: Boolean? = null,
	val nameEn: String? = null
) : Parcelable

@Parcelize
data class ProductCategoriesItem(
	val productId: Int? = null,
	val rank: Int? = null,
	val category: Category? = null,
	val categoryId: Int? = null
) : Parcelable

@Parcelize
data class ProductInvetoriesItem(
	val quantity: String? = null,
	val productId: Int? = null,
	val price: Int? = null,
	val salableQuantity: String? = null,
	val inventoryId: Int? = null,
	val id: Int? = null,
	val priceAfterDiscount: Double? = null,
	val status: Boolean? = null
) : Parcelable

@Parcelize
data class SearchProductResponseItem(
	val image: String? = null,
	val isAvailable: Boolean? = null,
	val additionalBarcode: String? = null,
	val merchantProducts: List<MerchantProductsItem?>? = null,
	val subCategoryId: Int? = null,
	val barCode: String? = null,
	val alwaysAvailable: Boolean? = null,
	val productCategories: List<ProductCategoriesItem?>? = null,
	val price: Int? = null,
	val name: String? = null,
	val salableQuantity: String? = null,
	val childQuantity: String? = null,
	val id: Int? = null,
	val sku: String? = null,
	val priceAfterDiscount: Double? = null,
	val productInvetories: List<ProductInvetoriesItem?>? = null,
	val productType: Int? = null
) : Parcelable
