package com.pengjieran.pay.init;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.LogManager;

/**
 * Created by Aaron on 2016/3/26.
 */
public class LoggerInit extends HttpServlet {

    @Override
    public void init() throws ServletException {

        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        InputStream stream = loader.getResourceAsStream("resources" + File.separator + "logger" + File.separator + "logger.xml");
        try {
            LogManager.getLogManager().readConfiguration(stream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        super.init();
    }

}