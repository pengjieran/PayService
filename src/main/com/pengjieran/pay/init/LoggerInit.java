package com.pengjieran.pay.init;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.LogManager;

/**
 * Created by Aaron on 2016/3/26.
 */
public class LoggerInit {

   public LoggerInit() {

       ClassLoader loader = Thread.currentThread().getContextClassLoader();
       InputStream stream = loader.getResourceAsStream("resources" + File.separator + "logger" + File.separator + "logger.xml");
       try {
           LogManager.getLogManager().readConfiguration(stream);
       } catch (IOException e) {
           e.printStackTrace();
       }
   }

}