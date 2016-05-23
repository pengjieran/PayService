package com.pengjieran.pay.web;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

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
    @RequestMapping(value = "/alipayweb", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public String pay(HttpServletRequest request, HttpServletResponse response) {

        return "{\"code\":\"0\"}";
    }

    /**
     * 调用ping++的支付接口
     * @return
     */
    @RequestMapping(value = "/payping", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Map<String, Object> payping() {

        Map<String, Object> map = new HashMap<>();
        map.put("code",-1);
        map.put("result","检索完成");

        return map;
    }

}