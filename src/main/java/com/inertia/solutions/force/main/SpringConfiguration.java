package com.inertia.solutions.force.main;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

/**
 * 
 * This class is a basic Spring IOC Container config
 * which does a @Component @Services scan on the base package name,
 * and also allows the AspectJ Style proxy generation.
 *
 */
@Configuration
@ComponentScan({"com.inertia.solutions.force"})
@PropertySource("classpath:snapshooter.properties")
public class SpringConfiguration {

	@Bean
	public static PropertySourcesPlaceholderConfigurer propertyPlaceholderConfigurer() {
	    return new PropertySourcesPlaceholderConfigurer();
	}
}