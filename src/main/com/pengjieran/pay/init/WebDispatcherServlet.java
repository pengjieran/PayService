package com.pengjieran.pay.init;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.LogManager;

/**
 * Created by aaron on 2016/3/25.
 */
@WebServlet(name="SpringMvc",urlPatterns={"/*"},initParams={@WebInitParam(name="contextConfigLocation",value="classpath*:**/spring-context.xml")},loadOnStartup=1,asyncSupported=true)
public class WebDispatcherServlet extends DispatcherServlet implements WebApplicationInitializer {

    static {

        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        InputStream stream = loader.getResourceAsStream("resources" + File.separator + "logger" + File.separator + "logger.xml");
        try {
            LogManager.getLogManager().readConfiguration(stream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {


    }
}
