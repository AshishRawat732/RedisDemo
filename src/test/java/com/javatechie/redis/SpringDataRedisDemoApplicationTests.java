package com.javatechie.redis;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
class SpringDataRedisDemoApplicationTests {

	public static Logger Logger = LoggerFactory.getLogger(SpringDataRedisDemoApplicationTests.class);

	@Test
	void contextLoads() {
		Logger.info("Test case executing...");
		assertEquals(true,true);
	}

}
