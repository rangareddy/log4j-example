package com.ranga.log4j;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 *
 * @author Ranga Reddy
 *
 */

public class Log4jExample {

	private static final Logger LOGGER = LogManager.getLogger("HelloWorld");

	public static void main(String[] args) {

		//System.setProperty("com.sun.jndi.ldap.object.trustURLCodebase", "true");

		String name = args.length > 0 ? args[0] : "Ranga Reddy";
		LOGGER.error("Hello, " + name);
		System.out.println("Hello, " + name);
	}
}