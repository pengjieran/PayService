package com.pengjieran.pay.init;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;

/**
 * Created by aaron on 2016/3/25.
 */
@WebServlet(name="SpringMvc",urlPatterns={"/*"},initParams={@WebInitParam(name="contextConfigLocation",value="classpath*:**/spring-context.xml")},loadOnStartup=1,asyncSupported=true)
public class WebDispatcherServlet extends DispatcherServlet implements WebApplicationInitializer {

    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {

        System.out.println("初始化系统开始");
    }
}
