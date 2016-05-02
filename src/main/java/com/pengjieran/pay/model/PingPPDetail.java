package com.pengjieran.pay.model;

import org.springframework.beans.factory.annotation.Value;

/**
 * ping++数据的配置项
 * Created by Aaron on 2016/5/2.
 */
public class PingPPDetail {

    @Value(value = "#{pingpp['appId']}")
    private String appId;

    @Value(value = "#{pingpp['apiKey']}")
    private String appKey;

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getAppKey() {
        return appKey;
    }

    public void setAppKey(String appKey) {
        this.appKey = appKey;
    }
}
