package com.twilio.multiplesms

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MultipleSMSApplication

fun main(args: Array<String>) {
	runApplication<MultipleSMSApplication>(*args)
}
