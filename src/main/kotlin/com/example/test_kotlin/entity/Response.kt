package com.example.test_kotlin.entity

import io.swagger.v3.oas.annotations.media.Schema

@Schema(description = "Базовая сущность респонса")
class Response(
    @Schema(description = "Сообщение об ошибке")
    var message: String
)


