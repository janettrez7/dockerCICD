
package com.example.entities

import jakarta.persistence.GenerationType
import io.micronaut.core.annotation.Introspected
import io.micronaut.serde.annotation.SerdeImport
import io.micronaut.serde.annotation.Serdeable
import io.micronaut.serde.annotation.Serdeable.Deserializable
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue

import jakarta.persistence.Id
import jakarta.persistence.Table

@Entity
@Serdeable
data class Todo(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,
    val content: String,
    val completed: Boolean
)
