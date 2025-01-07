package com.affirm.api
import io.ktor.server.engine.*
import io.ktor.server.netty.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun main() {
    embeddedServer(Netty, port = 8080) {
        routing {
            get("/") {
                call.respondText("Hello, World!")
            }
                get("/process/{input}") {
                    val input = call.parameters["input"] ?: "default"
                    call.respondText(com.affirm.processing.processData(input))
                }

        }
    }.start(wait = true)
}

