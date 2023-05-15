package com.kotlinspring.Repository.model

import javax.persistence.Entity
import javax.persistence.Id

@Entity
data class ItemEntity(
    @Id val id : Int,
    val type : String,
    val description : String,
    val status : String,
    val date : String
)


