package com.fhdone.springboot;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class TestJDBC {
	
	
	@Autowired
	@Qualifier("primaryJdbcTemplate")
	protected JdbcTemplate jdbcTemplate1;
	
	@Autowired
	@Qualifier("secondaryJdbcTemplate")
	protected JdbcTemplate jdbcTemplate2;

	
//	@Autowired
//	@Qualifier("primaryJdbcTemplate")
//	protected JdbcTemplate jdbcTemplate1;
	
//	@Autowired
//	@Qualifier("secondaryJdbcTemplate")
//	protected JdbcTemplate jdbcTemplate2;
	
//	@Before
//	public void setUp() {
////		jdbcTemplate1.update("DELETE  FROM  USER ");
////		jdbcTemplate2.update("DELETE  FROM  USER ");
//	}
//	
	@Test
	public void test() throws Exception {
		Assert.assertNotNull(jdbcTemplate1.queryForObject("select count(1) from tbl_stu0", String.class));
		Assert.assertNotNull(jdbcTemplate2.queryForObject("select count(1) from tbl_stu0", String.class));
	}
}
