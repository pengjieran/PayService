package com.pengjieran.test;

import com.pengjieran.util.PropertyUtil;

import java.io.File;
import java.util.Properties;

/**
 * Created by aaron on 2016/4/7.
 */
public class Console {

    public static void main (String[] args) {

        String path = "config" + File.separator + "alipay.properties";
        Properties properties = PropertyUtil.load(path);
        String property = properties.getProperty("alipay.charset");
        System.out.println(property);
    }
}
