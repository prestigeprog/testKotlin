package com.example.test_kotlin.service

import com.example.test_kotlin.entity.User
import com.example.test_kotlin.repository.UserRepository
import org.springframework.stereotype.Service

@Service
class UserService(private val userRepository:UserRepository) {

    fun getUserById(id: Long) : User = userRepository.getById(id)

    fun getAllUsers(): List<User> = userRepository.findAll()

    fun deleteUserById(id : Long) = userRepository.deleteById(id)

    fun editUser(id : Long, user: User) : User = userRepository.save(user.copy(id = id))

    fun addUser(user: User) : User = userRepository.save(user)

}