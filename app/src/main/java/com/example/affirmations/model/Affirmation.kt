package com.example.affirmations.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

//Esto es una clase de datos
data class Affirmation(
    @StringRes val stringResourceId: Int,
    @DrawableRes val imageResourcedId: Int
) {

}