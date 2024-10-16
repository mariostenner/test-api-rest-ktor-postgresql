package com.example.models

import kotlinx.serialization.Serializable

@Serializable
data class User(val name: String, val email: String, val state: String, val age: Int)
