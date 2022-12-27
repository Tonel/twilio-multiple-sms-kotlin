package com.twilio.multiplesms.service

import com.twilio.multiplesms.config.TwilioConfig
import com.twilio.multiplesms.data.Contact
import com.twilio.rest.api.v2010.account.Message
import com.twilio.type.PhoneNumber
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class SMSService (
    @Autowired private val twilioConfig: TwilioConfig
)  {
    fun sendMultipleSMS(
        contactList: List<Contact>,
        message: String
    ) {
        //  sending SMS in parallel to list of contacts
        //  passed as parameter
        contactList
            .parallelStream()
            .forEach{ user ->
                // initializing a message and sending it
                Message.creator(
                    PhoneNumber(user.phoneNumber),  // receiver phone number
                    PhoneNumber(twilioConfig.phoneNumber),  // sender phone number
                    message
                ).create()
            }
    }
}