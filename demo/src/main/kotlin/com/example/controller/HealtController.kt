package com.example.controller

import com.example.entities.Todo
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get


@Controller("/healthz")

class HealtController {
    @Get
    fun healthz():String {
        return "ok"
    }

}