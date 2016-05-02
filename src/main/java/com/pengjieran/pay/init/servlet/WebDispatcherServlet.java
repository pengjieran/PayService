package com.pengjieran.pay.init.servlet;

import com.pengjieran.pay.init.listener.WebContextLoaderListener;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.DispatcherType;
import javax.servlet.FilterRegistration;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import java.util.EnumSet;

/**
 * 初始化日志以及路由相关的数据
 * Created by aaron on 2016/4/6.
 */
@WebServlet(name="SpringMvc",urlPatterns={"/pay/*"},initParams={@WebInitParam(name="contextConfigLocation",value="classpath:spring/spring-web.xml")},loadOnStartup=1,asyncSupported=true)
public class WebDispatcherServlet extends DispatcherServlet implements WebApplicationInitializer{

    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {

        //container.addListener(new ContextLoaderListener());
        //servletContext.addListener(WebContextLoaderListener.class);
        servletContext.setInitParameter("contextConfigLocation", "classpath:spring/spring-context.xml");
        servletContext.setInitParameter("log4jConfigLocation","classpath*:log4j.xml");
        CharacterEncodingFilter characterEncodingFilter = new CharacterEncodingFilter();
        characterEncodingFilter.setEncoding("UTF-8");
        characterEncodingFilter.setForceEncoding(true);
        FilterRegistration filterRegistration = servletContext.addFilter("characterEncodingFilter", characterEncodingFilter);
        filterRegistration.addMappingForUrlPatterns(EnumSet.of(DispatcherType.REQUEST), false, "/*");
    }
}