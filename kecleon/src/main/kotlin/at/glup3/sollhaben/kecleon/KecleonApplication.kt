package at.glup3.sollhaben.kecleon

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.config.server.EnableConfigServer
import org.springframework.cloud.netflix.eureka.EnableEurekaClient

@EnableConfigServer
@EnableEurekaClient
@SpringBootApplication
class KecleonApplication

fun main(args: Array<String>) {
    runApplication<KecleonApplication>(*args)
}
