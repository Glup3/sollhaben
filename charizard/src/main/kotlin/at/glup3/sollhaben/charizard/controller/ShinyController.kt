package at.glup3.sollhaben.charizard.controller

import org.springframework.beans.factory.annotation.Value
import org.springframework.cloud.context.config.annotation.RefreshScope
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RefreshScope
@RestController
class ShinyController {

    @Value("\${message:Charmander}")
    lateinit var message: String

    @GetMapping("/message")
    fun getCoolMessage() = message
}