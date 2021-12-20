package com.ranga.log4j;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 *
 * @author Ranga Reddy
 * @version 1.0
 * @date 16-Dec-2021
 */

public class Log4jExample {

	private static final Logger LOGGER = LogManager.getLogger(Log4jExample.class);

	public static void main(String[] args) {

		String name = args.length > 0 ? args[0] : "Ranga Reddy";

		LOGGER.info("Hello, {}", name);
		System.out.println("Hello, " + name);
	}
}