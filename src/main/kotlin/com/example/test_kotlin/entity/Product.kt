package com.example.test_kotlin.entity

import javax.persistence.*

@Entity
@Table(name = "products")
data class Product(

    @Column(name = "name", length = 200)
    val name: String = "",

    @Column(name = "description", length = 1000)
    val description: String = "",

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Long = 0L
)
