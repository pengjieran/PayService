package com.pengjieran.pay.init.datasource;

import com.pengjieran.util.PropertyUtil;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.File;
import java.util.Properties;

/**
 * Created by Aaron on 2016/4/10.
 */
public class DSInit {

    @Autowired
    private DSConfig dsConfig;

    public void createDS() {

        Properties properties = PropertyUtil.load("config" + File.separator + "jdbc.properties");

        int count = dsConfig.getCount();

        for (int i = 0; i < count; i++) {

            dsConfig.setId(properties.getProperty("jdbc.id" + i));
            dsConfig.setDriverClassName(properties.getProperty("jdbc.id" + i + ".driverClassName"));
            dsConfig.setUrl(properties.getProperty("jdbc.id" + i + ".url"));
            dsConfig.setUsername(properties.getProperty("jdbc.id" + i + ".username"));
            dsConfig.setPassword(properties.getProperty("jdbc.id" + i + ".password"));
        }

        System.out.println(dsConfig.toString());
    }
}