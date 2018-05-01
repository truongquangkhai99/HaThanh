package com.fsoft.utils;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Log4J {

  private static Logger logger = Logger.getLogger(Log4J.class);

  /**
   * get logger.
   * 
   * @return
   */
  public static Logger getLogger() {
    PropertyConfigurator.configure(
        Log4J.class.getResource("" + "/log4jFILE.properties").getFile());
    return logger;

  }
}
