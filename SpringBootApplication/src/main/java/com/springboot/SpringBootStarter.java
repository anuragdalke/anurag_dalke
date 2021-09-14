package com.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.ConfigurableApplicationContext;

import springfox.documentation.swagger2.annotations.EnableSwagger2;



@ConfigurationProperties
@SpringBootApplication
@EnableSwagger2
public class SpringBootStarter {

	public static void main(String[] args) {

		ConfigurableApplicationContext applicationContext= 	SpringApplication.run(SpringBootStarter.class, args);

	}

}
