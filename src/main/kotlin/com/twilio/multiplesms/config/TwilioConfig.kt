package com.twilio.multiplesms.config

import com.twilio.Twilio
import jakarta.annotation.PostConstruct
import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Configuration

@Configuration
class TwilioConfig {
    // reading the Twilio ACCOUNT SID from application.properties
    @Value("\${twilio.account-sid}")
    var accountSid: String? = null

    // reading the Twilio AUTH TOKEN from application.properties
    @Value("\${twilio.auth-token}")
    var authToken: String? = null

    @PostConstruct
    fun twilioInit() {
        // initializing Twilio
        Twilio.init(
            accountSid,
            authToken
        )
    }
}