package com.example.jetheroes.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Hero(
        val id: String,
        val name: String,
        val photoUrl: String,
        val birth: String,
        val desc: String
        ) : Parcelable
