package com.kotlinspring.Repository

import com.kotlinspring.Repository.model.ItemEntity
import org.springframework.data.repository.CrudRepository

interface ItemRepository : CrudRepository<ItemEntity, Int>
