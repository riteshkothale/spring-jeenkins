package com.tech.springjeenkins;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class SpringJeenkinsApplicationTests {

	public static Logger logger = LoggerFactory.getLogger(SpringJeenkinsApplicationTests.class);
	@Test
	void contextLoads() {
		logger.info("Test Case Executiong");
		
	}

}
