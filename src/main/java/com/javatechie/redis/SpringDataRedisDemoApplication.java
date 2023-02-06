package com.javatechie.redis;

import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringDataRedisDemoApplication {

	public static Logger Logger = LoggerFactory.getLogger(SpringDataRedisDemoApplication.class);

   @PostConstruct
   public void init(){
	   Logger.info("Application started");
   }


	public static void main(String[] args) {
		Logger.info("Application executed");
	   SpringApplication.run(SpringDataRedisDemoApplication.class, args);
	}

}
