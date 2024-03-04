package com.example.repositories

import com.example.entities.Todo
import io.micronaut.data.annotation.Repository
import io.micronaut.data.repository.CrudRepository

@Repository
interface TodoRepository : CrudRepository<Todo, Long>


