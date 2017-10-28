package com.os.operando

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
open class Application {

    companion object {
        @JvmStatic
        fun main(s: Array<String>) {
            SpringApplication.run(Application::class.java, *s)
        }
    }
}
