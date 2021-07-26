package com.example.test_kotlin.repository

import com.example.test_kotlin.entity.Product
import com.example.test_kotlin.entity.User
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository: JpaRepository<User, Long> {
}