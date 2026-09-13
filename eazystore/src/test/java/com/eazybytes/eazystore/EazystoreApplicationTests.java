package com.eazybytes.eazystore;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootTest
class EazystoreApplicationTests {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Test
	void contextLoads() {
	}

	@Test
	void productsTableIsInitialized() {
		Integer productCount = jdbcTemplate.queryForObject("SELECT COUNT(*) FROM products", Integer.class);

		Assertions.assertNotNull(productCount);
		Assertions.assertTrue(productCount > 0);
	}

}
