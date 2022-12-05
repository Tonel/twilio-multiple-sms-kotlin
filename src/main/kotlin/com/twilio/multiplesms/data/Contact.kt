package com.twilio.multiplesms.data

class Contact {
    var fullName: String? = null
    var phoneNumber: String? = null

    fun Contact() {}

    fun Contact(
        fullName: String,
        phoneNumber: String
    ) {
        this.fullName = fullName
        this.phoneNumber = phoneNumber
    }
}