package com.os.operando

import org.springframework.boot.builder.SpringApplicationBuilder
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer

open class ServletInitializer : SpringBootServletInitializer() {

    @Override
    override fun configure(builder: SpringApplicationBuilder): SpringApplicationBuilder {
        return builder.sources(Application::class.java)
    }
}
