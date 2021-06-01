package at.glup3.sollhaben.lugia

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer

@EnableEurekaServer
@SpringBootApplication
class LugiaApplication

fun main(args: Array<String>) {
	runApplication<LugiaApplication>(*args)
}
