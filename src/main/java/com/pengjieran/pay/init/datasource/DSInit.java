package com.pengjieran.pay.init.datasource;

import com.alibaba.druid.sql.builder.SQLBuilderFactory;
import com.alibaba.druid.util.JdbcUtils;
import com.pengjieran.util.BeanUtil;
import org.springframework.context.ApplicationContext;

import javax.sql.DataSource;

/**
 * Created by Aaron on 2016/4/10.
 */
public class DSInit {

    public void createDS() {

        DSConfig config = new DSConfig();
        System.out.println(config.toString());
    }
}