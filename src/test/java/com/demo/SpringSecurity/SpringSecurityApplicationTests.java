package com.demo.SpringSecurity;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

// @SpringBootTest
class SpringSecurityApplicationTests {

	@Test
	void contextLoads() {
		System.getenv().forEach(
				(key, value) -> System.out.println(key + " " + value)
		);
	}

}
