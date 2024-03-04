package com.example.controller

import com.example.entities.Todo
import com.example.repositories.TodoRepository
import io.micronaut.http.annotation.Body
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Delete
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.Post


@Controller("/todos")
class TodoController(private val todoRepository: TodoRepository) {

    @Get
    fun getAllTodos(): List<Todo> {
        return todoRepository.findAll()
    }

    @Get("/{id}")
    fun getTodoById(id: Long): Todo? {
        return todoRepository.findById(id).orElse(null)
    }

    @Post
    fun saveTodo(@Body todo : Todo) :Todo{
        return todoRepository.save(todo)
    }

    @Delete("/{id}")
    fun deleteTodo(id:Long){
        return todoRepository.deleteById(id)
    }

}