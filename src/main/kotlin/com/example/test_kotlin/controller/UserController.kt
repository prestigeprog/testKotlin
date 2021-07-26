package com.example.test_kotlin.controller

import com.example.test_kotlin.entity.Response
import com.example.test_kotlin.entity.User
import com.example.test_kotlin.service.UserService
import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.tags.Tag
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("users")
@Tag(name = "Контроллер пользователей")
class UserController(private val userService: UserService) {

    @Operation(summary = "Все юзеры")
    @GetMapping
    fun index(): ResponseEntity<List<User>> {
        return ResponseEntity(userService.getAllUsers(), HttpStatus.OK)
    }

    @Operation(summary = "Добавить нового юзера")
    @PostMapping
    fun create(@RequestBody user: User): ResponseEntity<User> {
        return ResponseEntity(userService.addUser(user), HttpStatus.OK)
    }

    @Operation(summary = "Получить юзера по Id")
    @GetMapping("{id}")
    fun read(@PathVariable id: Long) : ResponseEntity<User> = ResponseEntity(userService.getUserById(id), HttpStatus.OK)

    @Operation(summary = "Изменить юзера")
    @PutMapping("{id}")
    fun update(@PathVariable id: Long, @RequestBody user: User) : ResponseEntity<User>  {
        userService.editUser(id, user)
        return ResponseEntity(userService.getUserById(id), HttpStatus.OK)
    }

    @Operation(summary = "Удалить юзера")
    @DeleteMapping("{id}")
    fun delete(@PathVariable id: Long) :ResponseEntity<Response> {
        userService.deleteUserById(id)
        return ResponseEntity(Response("Удален юзер с id $id"), HttpStatus.OK)
    }
}