package com.philheenan.kotlinentities.remote

import com.google.gson.annotations.SerializedName
import com.philheenan.kotlinentities.model.UserKotlin

/**
 * Created by phillip.heenan on 10/02/15.
 */
trait ApiMappingKotlin<out T> {
    fun modelFromMap(): T
}

public data class ApiUserKotlin(
        SerializedName("user_name") var userName: String,
        SerializedName("user_id") var id: Int = -1,
        SerializedName("user_email") var userEmail: String? = null) : ApiMappingKotlin<UserKotlin> {

    override fun modelFromMap(): UserKotlin {
        return UserKotlin(this.id, this.userName, this.userEmail)
    }
}