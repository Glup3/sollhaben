package at.glup3.sollhaben.charizard

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.EnableEurekaClient

@EnableEurekaClient
@SpringBootApplication
class CharizardApplication

fun main(args: Array<String>) {
	runApplication<CharizardApplication>(*args)
}
