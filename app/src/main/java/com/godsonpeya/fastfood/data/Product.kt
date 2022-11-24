package com.godsonpeya.fastfood.data

import androidx.annotation.DrawableRes
import com.godsonpeya.fastfood.R


data class Product(var id: Int, var name: String, var price: String, @DrawableRes var image: Int)

data class Products(var name: String, var products: List<Product>)

val data = listOf(Products(name = "Recommended Combo",
    products = listOf(
        Product(id = 1, name = "Product 6", price = "$800", image = R.drawable.product_six),
        Product(id = 1, name = "Product 7", price = "$100", image = R.drawable.product_seven),
    )),
    Products(name = "Hottest,Popular,New combo,Top",
        products = listOf(
            Product(id = 1, name = "Product 1", price = "$900", image = R.drawable.produit_one),
            Product(id = 1, name = "Product 2", price = "$500", image = R.drawable.banner_two),
            Product(id = 1, name = "Product 3", price = "$300", image = R.drawable.product_three),
            Product(id = 1, name = "Product 4", price = "$600", image = R.drawable.product_four),
            Product(id = 1, name = "Product 5", price = "$200", image = R.drawable.product_five),
        )))