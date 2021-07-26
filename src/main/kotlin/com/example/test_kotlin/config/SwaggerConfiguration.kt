package com.example.test_kotlin.config

import io.swagger.v3.oas.annotations.OpenAPIDefinition
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType
import io.swagger.v3.oas.annotations.info.Info
import io.swagger.v3.oas.annotations.security.SecurityScheme
import org.springframework.context.annotation.Configuration

@Configuration
@SecurityScheme(
    type = SecuritySchemeType.HTTP
)
@OpenAPIDefinition(
    info = Info(
        title = "test_Kotlin",
        version = "1.0.0"
    )
)
class SwaggerConfiguration {
}

