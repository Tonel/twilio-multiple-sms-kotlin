package com.twilio.multiplesms.data

import com.fasterxml.jackson.annotation.JsonProperty

data class MultipleSMSBody(
    @JsonProperty("contacts")
    val contacts: List<Contact>,
    @JsonProperty("message")
    val message: String
)