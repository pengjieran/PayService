package com.pengjieran.pay.service.impl;

import com.pengjieran.pay.service.PayService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * Created by aaron on 2016/4/6.
 */
@Service(value = "alipayService")
public class AliPayService implements PayService {

    private static final Logger logger = LoggerFactory.getLogger(AliPayService.class);

    @PostConstruct
    public void initAliPay() {

        logger.info("支付宝支付前置初始化");
    }
}