package com.example.test_kotlin

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
open class TestKotlinApplication

fun main(args: Array<String>) {
	runApplication<TestKotlinApplication>(*args)
}
