package com.kotlinspring.Service

import com.kotlinspring.Exception.ItemEntityNotFoundException
import com.kotlinspring.Repository.ItemRepository
import com.kotlinspring.Repository.model.ItemEntity
import org.springframework.http.HttpStatus
import org.springframework.stereotype.Service

@Service
class AgileService (private val itemRepository: ItemRepository) {

    fun getAllItems() : List<ItemEntity> {
        return itemRepository.findAll().toList()
    }
    
    fun createItem(item : ItemEntity){
        itemRepository.save(item)
    }

    fun getById(id : Int) {
        itemRepository.findById(id)
    }

    fun updateItemById(id : Int, item: ItemEntity) : ItemEntity{
        return if (itemRepository.existsById(id)){
            itemRepository.save(ItemEntity(
                id = item.id,
                type = item.type,
                description = item.description,
                status = item.status,
                date = item.date
            ))
        } else throw ItemEntityNotFoundException(HttpStatus.NOT_FOUND, "No matching item was found")

    }

    fun deleteItemById(id : Int){
        if (itemRepository.existsById(id)){
            itemRepository.deleteById(id)
        }
    }


    }


