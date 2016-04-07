package com.pengjieran.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by aaron on 2016/4/7.
 */
public class PropertyUtil {

    private static final Logger logger = LoggerFactory.getLogger(PropertyUtil.class);

    public static Properties load(String filePath) {

        InputStream inputStream = ClassLoader.getSystemResourceAsStream(filePath);
        Properties properties = new Properties();
        try {

            properties.load(inputStream);
            return properties;
        } catch (IOException e) {

            logger.error(e.getLocalizedMessage(), e);
            return properties;
        }
    }
}