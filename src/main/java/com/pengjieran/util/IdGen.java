package com.pengjieran.util;

import java.security.SecureRandom;
import java.util.UUID;

/**
 * 封装各种id唯一性生成算法
 * Created by Aaron on 2016/4/10.
 */
public class IdGen {

    private static SecureRandom random = new SecureRandom();

    public static String uuid() {

        return UUID.randomUUID().toString().replaceAll("-", "");
    }

    /**
     * 使用SecureRandom随机生成Long.
     */
    public static long randomLong() {
        return Math.abs(random.nextLong());
    }

}