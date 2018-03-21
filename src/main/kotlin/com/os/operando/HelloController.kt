package com.os.operando

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloController {

    @RequestMapping("/")
    fun index(): String {
        return "HelloController!!"
    }

    @RequestMapping("/get")
    fun get(@RequestParam(value = "id", defaultValue = "1") id: Int): User {
        return User(id, "test")
    }

    data class User(val id: Int, val name: String)
}