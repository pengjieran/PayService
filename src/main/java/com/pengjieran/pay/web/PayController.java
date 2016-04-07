package com.pengjieran.pay.web;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by aaron on 2016/4/5.
 */
@RestController
@RequestMapping(value = "/pay")
public class PayController {

    /**
     * 提供支付宝支付web页面的导向服务
     * @return
     */
    @RequestMapping(value = "/alipayweb", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public String pay(@RequestParam("orderNumber") String orderNumber, HttpServletRequest request, HttpServletResponse response) {

        return "{\"code\":\"0\"}";
    }
}