package com.example.test_kotlin.repository

import com.example.test_kotlin.entity.Product
import org.springframework.data.jpa.repository.JpaRepository

interface ProductRepository : JpaRepository<Product, Long> {
}