package com.twilio.multiplesms.service

import com.twilio.multiplesms.data.Contact
import com.twilio.rest.api.v2010.account.Message
import com.twilio.type.PhoneNumber
import org.springframework.stereotype.Service

@Service
class SMSService {
    // replace this with your Twilio phone number
    private val TWILIO_PHONE_NUMBER: String = "+1555555555"

    fun sendMultipleSMS(
        contactList: List<Contact>,
        message: String
    ) {
        //  sending SMS in parallel to list of contacts
        //  passed as parameter
        contactList
            .parallelStream()
            .forEach{ user: Contact ->
                // initializing a message and sending it
                Message.creator(
                    PhoneNumber(TWILIO_PHONE_NUMBER),  // sender phone number
                    PhoneNumber(user.phoneNumber),  // receiver phone number
                    message
                ).create()
            }
    }
}