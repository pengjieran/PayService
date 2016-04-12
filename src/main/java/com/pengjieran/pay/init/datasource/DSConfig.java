package com.pengjieran.pay.init.datasource;

import org.springframework.beans.factory.annotation.Value;

/**
 * Created by Aaron on 2016/4/10.
 */
public class DSConfig {

    private String id;

    private String url;

    private String username;

    private String password;

    private String driverClassName;

    @Value("#{jdbc['jdbc.defaultAutoCommit']}")
    private boolean defaultAutoCommit;

    private String connectProperties;

    @Value("#{jdbc['jdbc.initialSize']}")
    private int initialSize;

    @Value("#{jdbc['jdbc.minIdle']}")
    private int minIdle;

    @Value("#{jdbc['jdbc.maxActive']}")
    private int maxActive;

    @Value("#{jdbc['jdbc.maxWait']}")
    private int maxWait;

    @Value("#{jdbc['jdbc.timeBetweenEvictionRunsMillis']}")
    private long timeBetweenEvictionRunsMillis;
}