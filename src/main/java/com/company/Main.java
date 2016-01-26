package com.company;

import org.apache.log4j.Logger;

public class Main {
    final static Logger logger = Logger.getLogger(Main.class);
    public static void main(String[] args) {
	// write your code here
        System.out.println("hello");
        logger.info("some info from logger");
    }
}
