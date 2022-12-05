package com.twilio.multiplesms.data

import com.fasterxml.jackson.annotation.JsonProperty

class MultipleSMSBody {
    @JsonProperty("contacts")
    var contacts: List<Contact> = ArrayList()

    @JsonProperty("message")
    var message: String = "Hello, World!"
}