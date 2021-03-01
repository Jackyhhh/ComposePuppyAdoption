package com.example.androiddevchallenge

import androidx.annotation.DrawableRes

data class Dog(
        val name: String,
        val location: String,
        val age: String,
        val gender: String,
        val breed: String,
        @DrawableRes val picture: Int,
)