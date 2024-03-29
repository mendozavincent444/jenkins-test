package com.example.demo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

	public static final Logger LOGGER = LoggerFactory.getLogger(DemoApplicationTests.class);

	@Test
	void contextLoads() {
		LOGGER.info("Test case executing...");

		assertTrue(true);
	}

}
