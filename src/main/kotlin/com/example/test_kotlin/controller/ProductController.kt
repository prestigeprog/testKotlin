package com.example.test_kotlin.controller

import com.example.test_kotlin.entity.Response
import com.example.test_kotlin.entity.Product
import com.example.test_kotlin.service.ProductService
import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.tags.Tag
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("products")
@Tag(name = "Контроллер продуктов")
class ProductController(private val productService: ProductService) {

    @Operation(summary = "Все продукты")
    @GetMapping
    fun index(): ResponseEntity<List<Product>> {
        return ResponseEntity(productService.all(), HttpStatus.OK)
    }

    @Operation(summary = "Добавить новый продукт")
    @PostMapping
    fun create(@RequestBody product: Product): ResponseEntity<Product> {
        return ResponseEntity(productService.add(product), HttpStatus.OK)
    }

    @Operation(summary = "Получить продукт по Id")
    @GetMapping("{id}")
    fun read(@PathVariable id: Long) : ResponseEntity<Product> = ResponseEntity(productService.get(id), HttpStatus.OK)

    @Operation(summary = "Изменить продукт")
    @PutMapping("{id}")
    fun update(@PathVariable id: Long, @RequestBody product: Product) : ResponseEntity<Product>  {
        productService.edit(id, product)
        return ResponseEntity(productService.get(id), HttpStatus.OK)
    }

    @Operation(summary = "Удалить продукт")
    @DeleteMapping("{id}")
    fun delete(@PathVariable id: Long) :ResponseEntity<Response> {
        productService.remove(id)
        return ResponseEntity(Response("Удален продукт с id $id"), HttpStatus.OK)
    }

}