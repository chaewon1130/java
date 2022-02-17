package com.pcwk.obj10.log4j;

import org.apache.log4j.Logger;

public class Log4JMain {

	final static Logger LOG = Logger.getLogger(Log4JMain.class);

	public static void main(String[] args) {
		LOG.debug("====================");
		LOG.debug("=log4j=");
		LOG.debug("====================");
	}

}
