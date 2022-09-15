package com.eldeskar.ofood;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Spring Boot SpringApplication class is used to bootstrap and launch a Spring application from a Java main method.
 * This class automatically creates the ApplicationContext from the classpath,
 * scan the configuration classes and launch the application.
 */
@SpringBootApplication
public class OFoodApplication {

	/**
	 * Entry point of the executable
	 *
	 * @param args that can be passed to the application
	 *             at the moment no args are processed.
	 */
	public static void main(String[] args) {
		SpringApplication.run(OFoodApplication.class, args);
	}

}
