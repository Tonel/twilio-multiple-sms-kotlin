package com.twilio.multiplesms.config

import com.twilio.Twilio
import jakarta.annotation.PostConstruct
import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Configuration

@Configuration
class TwilioConfig(
    // reading the Twilio ACCOUNT SID from application.properties
    @Value("\${twilio.account-sid}") val accountSid: String,
    // reading the Twilio AUTH TOKEN from application.properties
    @Value("\${twilio.auth-token}") val authToken: String,
    // reading the Twilio PHONE NUMBER from application.properties
    @Value("\${twilio.phone-number}") val phoneNumber: String
) {
    @PostConstruct
    fun twilioInit() {
        // initializing Twilio
        Twilio.init(
            accountSid,
            authToken
        )
    }
}