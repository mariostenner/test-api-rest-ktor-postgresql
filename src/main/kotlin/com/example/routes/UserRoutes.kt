package com.example.routes

import com.example.models.User
import io.ktor.http.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import kotlin.text.get


private val users = mutableListOf(
    User("Mario", "mariostenner@gmail.com", "Jalisco", 30),
    User("juan", "juan@gmail.com", "Durango", 20)
)

fun Route.userRouting() {
    route("/user") {
        get {
            if (users.isNotEmpty()) {
                call.respond(users)
            } else {
                call.respondText("Error", status = HttpStatusCode.OK)
            }
        }
    }
}