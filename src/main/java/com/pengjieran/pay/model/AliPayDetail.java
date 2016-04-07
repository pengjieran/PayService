package com.pengjieran.pay.model;

import org.springframework.beans.factory.annotation.Value;

/**
 * Created by Aaron on 2016/4/6.
 */
public class AliPayDetail extends PayDetail {

    @Value(value = "#{alipay['alipay.charset']}")
    private String charset;

    @Value(value = "#{alipay['alipay.notifyUrl']}")
    private String notifyUrl;

    @Value(value = "#{alipay['alipay.returnUrl']}")
    private String returnUrl;

    @Value(value = "#{alipay['alipay.signtype']}")
    private String signType;
}
