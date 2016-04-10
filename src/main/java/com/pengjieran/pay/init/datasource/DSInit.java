package com.pengjieran.pay.init.datasource;

import com.alibaba.druid.sql.builder.SQLBuilderFactory;
import com.alibaba.druid.util.JdbcUtils;

import javax.sql.DataSource;

/**
 * Created by Aaron on 2016/4/10.
 */
public class DSInit {

//    public DataSource createDataSource() {
//        SQLBuilderFactory.createSelectSQLBuilder(JdbcUtils.MYSQL).from("aa").from("bb").from("cc").selectWithAlias("aa.name", "name").limit(20, 20).where("aa.id=?").toString();
//    }

    public static void main(String[] args) {

        String s = SQLBuilderFactory.createSelectSQLBuilder(JdbcUtils.MYSQL).from("aa,bb,cc").selectWithAlias("aa.name", "name").limit(20, 20).where("aa.id=?").toString();
        System.out.println(s);
    }
}