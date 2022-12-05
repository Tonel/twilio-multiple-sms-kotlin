package com.twilio.multiplesms.controller

import com.twilio.multiplesms.data.MultipleSMSBody
import com.twilio.multiplesms.service.SMSService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/sms")
class AlertController {
    @Autowired
    private lateinit var  smsService: SMSService

    @PostMapping("sendMultipleSMS")
    fun sendMultipleSMS(@RequestBody multipleSMSBody: MultipleSMSBody) {
        smsService.sendMultipleSMS(
            multipleSMSBody.contacts,
            multipleSMSBody.message
        )
    }
}