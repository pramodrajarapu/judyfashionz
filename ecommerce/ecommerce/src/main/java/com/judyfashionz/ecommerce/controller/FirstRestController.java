package com.judyfashionz.ecommerce.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/services")
public class FirstRestController {

    @RequestMapping(value = "/getServiceName", method = RequestMethod.GET)
    public @ResponseBody String getServiceName() {
        return "Judy Fashionz";
    }
}
