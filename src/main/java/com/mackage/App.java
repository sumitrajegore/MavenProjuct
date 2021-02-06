package com.mackage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App 
{
	private static final Logger LOG = LogManager.getLogger(App.class);

    public static void main( String[] args )
    {
        String message = "Hello World ";
        LOG.debug(message + "will be printed on debug");
        LOG.info(message + "will be printed on info");
        LOG.warn(message + "will be printed on warn");
        LOG.error(message + "will be printed on error");
        LOG.fatal(message + "will be printed on fatal");
        LOG.info("Appending string : {}.", message);
        System.out.println(message);
    }
}
