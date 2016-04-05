package com.pengjieran.pay.init.web;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by aaron on 2016/4/5.
 */
@RestController
@RequestMapping(value = "/pay")
public class PayController {

    @RequestMapping(value = "/web", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public String payInfo() {

        return "{\"code\":\"0\"}";
    }
}