package com.example.coderswag.services

import com.example.coderswag.models.product

object dataService {
    val categories = listOf(
        com.example.coderswag.models.category("SHIRTS", "shirtimage"),
        com.example.coderswag.models.category("HOODIES", "hoodieimage"),
        com.example.coderswag.models.category("HATS", "hatimage"),
        com.example.coderswag.models.category("DIGITAL", "digitalgoodsimage")
        //com.example.coderswag.models.category("SHIRTS", "shirtimage")
        //com.example.coderswag.models.category("HOODIES", "hoodieimage"),
        //com.example.coderswag.models.category("HATS", "hatimage"),
        //com.example.coderswag.models.category("DIGITAL", "digitalgoodsimage")
    )
    val hats = listOf(
        product("Devslopes Graphic Beanie", "$18", "hat1"),
        product("Devslopes Hat Black", "$20", "hat2"),
        product("Devslopes Hat White", "$18", "hat3"),
        product("Devslopes Hat Snapback", "$22", "hat4")
    )
    val hoodie = listOf(
        product("Devslopes Logo Hoodie Gray", "$28", "hoodie1"),
        product("Devslopes Hoodie Red", "$32", "hoodie2"),
        product("Devslopes Banner Hoodie Gray", "$28", "hoodie3"),
        product("Devslopes Black Hoodie", "$22", "hoodie4")
    )
    val shirts = listOf(
        product("Devslopes Shirt Black", "18", "shirt1"),
        product("Devslopes Badge Light Gray", "$20", "shirt2"),
        product("Devslopes Logo Shirt Red", "$22", "shirt3"),
        product("Devslopes Hustle", "$22", "shirt4"),
        product("Kickflip Studios", "$18", "shirt5")
    )
}