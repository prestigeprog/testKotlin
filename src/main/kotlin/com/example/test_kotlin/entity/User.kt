package com.example.test_kotlin.entity

import javax.persistence.*

@Entity
@Table(name = "shop_users")
data class User(

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Long = 0L,

    @Column(name = "username")
    val username:String = "",

    @Column(name = "password")
    val password: String = "") {
}