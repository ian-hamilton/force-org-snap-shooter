package com.inertia.solutions.force.main;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;




/**
 * The Class Launcher is used to launch the
 * execution of the AOP application.
 */
public final class Launcher {
	private static Logger log = Logger.getLogger(Launcher.class);

	/**
	 * Instantiates a new launcher set to
	 * private since this is a final class.
	 */
	private Launcher() { }

	/*
	 * to run this application in the console execute the following command at the project pom
	 *
	 * mvn exec:java -Dexec.mainClass="com.inertia.solutions.force.main.Launcher"
	 */

	/**
	 * Main application execution, which spins up a
	 * console dialag for the user.
	 *
	 * @param args the arguments
	 */
	public static void main(final String[] args) {
		log.info("******** Force Snap Shooter Started **********");		
		ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfiguration.class);


		((AnnotationConfigApplicationContext) ctx).close();
		log.info("******** Force Snap Shooter Complete **********");
	}

}
