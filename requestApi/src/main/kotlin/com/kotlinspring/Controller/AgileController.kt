package com.kotlinspring.Controller

import com.kotlinspring.Repository.model.ItemEntity
import com.kotlinspring.Service.AgileService
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*


@RestController
@RequestMapping("/request")
class AgileController(private val agileService: AgileService) {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun createItem(@RequestBody payload: ItemEntity){
        agileService.createItem(payload)

    }

    @GetMapping("/items")
    fun getAllItem():List<ItemEntity>{
        return agileService.getAllItems()
    }

    @GetMapping("/items/{id}")
    fun getItemById(id : Int){
        agileService.getById(id)
    }

    @PutMapping("/items/{id}")
    fun updateItemById(id: Int, @RequestBody payload: ItemEntity,) {
        agileService.updateItemById(id,payload)
    }

    @DeleteMapping("/items/{id}")
    fun deleteItemById(id: Int){
        agileService.deleteItemById(id)
    }

}