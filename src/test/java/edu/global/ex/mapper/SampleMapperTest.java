package edu.global.ex.mapper;

import static org.junit.jupiter.api.Assertions.*;

import javax.sql.DataSource;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SampleMapperTest {
	
	@Autowired
	private DataSource ds;
	@Autowired
	private SampleMapper sampleMapper;
	
	@Test
	void testDatasource() {
		System.out.println("DS=" + ds);
		fail("Not yet implemented");
	}
	
	@Test
	void testGetTime() {
		System.out.println(sampleMapper.getTime());
		fail("Not yet implemented");
	}

}
