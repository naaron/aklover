package com.aekyung.aklover;

import java.sql.Connection;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.aekyung.aklover.mapper.web.BoardMapper;


@RunWith(SpringRunner.class)
@SpringBootTest
public class AkloverApplicationTests {

	/*@Autowired
	private DataSource dataSource;
	
	@Autowired
	private SqlSessionFactory sqlSession;*/
	
	@Autowired
	private BoardMapper boardMapper;
	
	@Test
	public void contextLoads() {
	}
	
	@Test
	public void testConnction() throws Exception {
		/*System.out.println(dataSource);
		
		Connection connection = dataSource.getConnection();
		
		System.out.println(connection);
		
		System.out.println("sqlSession=============" + sqlSession);
		
		connection.close();*/
		
		List<Map<String, Object>> list = boardMapper.selectHeroGroup();
		System.out.println("list==============="+list);
		
	}

}
