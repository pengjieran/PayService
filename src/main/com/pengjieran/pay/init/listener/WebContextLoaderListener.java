package com.pengjieran.pay.init.listener;

import com.pengjieran.pay.init.LoggerInit;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.WebApplicationContext;

import javax.servlet.ServletContext;

/**
 * Created by aaron on 2016/3/31.
 */
public class WebContextLoaderListener extends ContextLoaderListener {

    @Override
    public WebApplicationContext initWebApplicationContext(ServletContext servletContext) {

        System.out.println("欢迎使用支付快速开发平台");

        return super.initWebApplicationContext(servletContext);
    }

}
