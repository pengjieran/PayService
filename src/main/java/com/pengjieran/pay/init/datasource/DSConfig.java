package com.pengjieran.pay.init.datasource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by Aaron on 2016/4/10.
 * @Component 用于支持属性映射
 */
@Component
public class DSConfig {

    private String id;

    private String url;

    private String username;

    private String password;

    private String driverClassName;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDriverClassName() {
        return driverClassName;
    }

    public void setDriverClassName(String driverClassName) {
        this.driverClassName = driverClassName;
    }

    @Value("#{jdbc['jdbc.count']}")
    private int count;

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

    public int getCount() {
        return count;
    }

    public boolean isDefaultAutoCommit() {
        return defaultAutoCommit;
    }

    public int getInitialSize() {
        return initialSize;
    }

    public int getMinIdle() {
        return minIdle;
    }

    public int getMaxActive() {
        return maxActive;
    }

    public int getMaxWait() {
        return maxWait;
    }

    public String getValidationQuery() {
        return validationQuery;
    }

    public long getTimeBetweenEvictionRunsMillis() {
        return timeBetweenEvictionRunsMillis;
    }

    public long getMinEvictableIdleTimeMillis() {
        return minEvictableIdleTimeMillis;
    }

    public boolean isTestWhileIdle() {
        return testWhileIdle;
    }

    public boolean isTestOnBorrow() {
        return testOnBorrow;
    }

    public boolean isTestOnReturn() {
        return testOnReturn;
    }

    public boolean isRemoveAbandoned() {
        return removeAbandoned;
    }

    public boolean isLogAbandoned() {
        return logAbandoned;
    }

    public int getRemoveAbandonedTimeout() {
        return removeAbandonedTimeout;
    }

    public boolean isPoolPreparedStatements() {
        return poolPreparedStatements;
    }

    public int getMaxPoolPreparedStatementPerConnectionSize() {
        return maxPoolPreparedStatementPerConnectionSize;
    }

    public String getFilters() {
        return filters;
    }

    @Override
    public String toString() {
        return validationQuery;
    }
}