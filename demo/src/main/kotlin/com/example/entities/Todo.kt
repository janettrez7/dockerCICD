
package com.example.entities

import jakarta.persistence.GenerationType
import io.micronaut.core.annotation.Introspected
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue

import jakarta.persistence.Id

@Entity
@Introspected
data class Todo(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,
    val content: String,
    val completed: Boolean
)
