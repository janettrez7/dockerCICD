package com.example.entities


import io.micronaut.core.annotation.Generated
import io.micronaut.core.annotation.Introspected
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id

@Entity
@Introspected
data class todo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY))
    val Id: Long? = null,
    val content: String,
    val isCompleted: Boolean

}