package com.kt.application

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ApplicationKtApplication

fun main(args: Array<String>) {
    runApplication<ApplicationKtApplication>(*args)
}
