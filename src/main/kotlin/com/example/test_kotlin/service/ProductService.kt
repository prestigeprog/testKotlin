package com.example.test_kotlin.service

import com.example.test_kotlin.entity.Product
import com.example.test_kotlin.repository.ProductRepository
import org.springframework.stereotype.Service

@Service
class ProductService(private val productRepository: ProductRepository) {

    fun all(): List<Product> = productRepository.findAll()

    fun get(id: Long): Product = productRepository.findById(id).get()

    fun add(product: Product): Product = productRepository.save(product)

    fun edit(id: Long, product: Product): Product = productRepository.save(product.copy(id = id))

    fun remove(id: Long) = productRepository.deleteById(id)
}