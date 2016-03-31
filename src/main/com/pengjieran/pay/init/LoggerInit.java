package com.pengjieran.pay.init;

import javax.servlet.http.HttpServlet;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.LogManager;

/**
 * Created by Aaron on 2016/3/26.
 */
public class LoggerInit extends HttpServlet{

    @Override
    public void init() {

        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        InputStream stream = loader.getResourceAsStream("src" + File.separator + "main" + File.separator + "resources" + File.separator + "logger" + File.separator + "log4j.xml");
        try {
            LogManager.getLogManager().readConfiguration(stream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}