package com.sb2.hikari;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HikariApplicationTests {
private static final Logger logger = LoggerFactory.getLogger(HikariApplicationTests.class);
	@Autowired
	private UserMapper userMapper;

	@Test
	public void contextLoads() {
		String name = userMapper.get(1);
		logger.info("name {} ",name);
	}

}
