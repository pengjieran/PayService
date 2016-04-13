package com.pengjieran.pay.init.datasource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by Aaron on 2016/4/10.
 */
@Component
public class DSConfig {

    private String id;

    private String url;

    private String username;

    private String password;

    private String driverClassName;

    @Value("#{jdbc['jdbc.defaultAutoCommit']}")
    private boolean defaultAutoCommit;

    @Value("#{jdbc['jdbc.initialSize']}")
    private int initialSize;

    @Value("#{jdbc['jdbc.minIdle']}")
    private int minIdle;

    @Value("#{jdbc['jdbc.maxActive']}")
    private int maxActive;

    @Value("#{jdbc['jdbc.maxWait']}")
    private int maxWait;

    @Value("#{jdbc['jdbc.validationQuery']}")
    private String validationQuery;

    @Value("#{jdbc['jdbc.timeBetweenEvictionRunsMillis']}")
    private long timeBetweenEvictionRunsMillis;

    @Value("#{jdbc['jdbc.minEvictableIdleTimeMillis']}")
    private long minEvictableIdleTimeMillis;

    @Value("#{jdbc['jdbc.testWhileIdle']}")
    private boolean testWhileIdle;

    @Value("#{jdbc['jdbc.testOnBorrow']}")
    private boolean testOnBorrow;

    @Value("#{jdbc['jdbc.testOnReturn']}")
    private boolean testOnReturn;

    @Value("#{jdbc['jdbc.removeAbandoned']}")
    private boolean removeAbandoned;

    @Value("#{jdbc['jdbc.logAbandoned']}")
    private boolean logAbandoned;

    @Value("#{jdbc['jdbc.removeAbandonedTimeout']}")
    private int removeAbandonedTimeout;

    @Value("#{jdbc['jdbc.poolPreparedStatements']}")
    private boolean poolPreparedStatements;

    @Value("#{jdbc['jdbc.maxPoolPreparedStatementPerConnectionSize']}")
    private int maxPoolPreparedStatementPerConnectionSize;

    @Value("#{jdbc['jdbc.filters']}")
    private String filters;

    @Override
    public String toString() {
        return validationQuery;
    }
}