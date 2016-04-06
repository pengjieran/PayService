package com.pengjieran.pay.service.impl;

import com.pengjieran.pay.service.PayService;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * Created by aaron on 2016/4/6.
 */
@Service(value = "alipayService")
public class AliPayService implements PayService {

    @PostConstruct
    public void initAliPay() {
        System.out.println("初始化项目");
    }
}