package com.aekyung.aklover;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

@SpringBootApplication
@MapperScan(basePackages = "com.aekyung.aklover.mapper")
public class AkloverApplication {

	public static void main(String[] args) {
		SpringApplication.run(AkloverApplication.class, args);
	}
	
	/**
     * SqlSessionFactory 설정
     */
    @Bean
    public SqlSessionFactory sqlSessionFactory(DataSource dataSource)throws Exception{
        SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
            sessionFactory.setDataSource(dataSource);
            
            sessionFactory.setMapperLocations(new
    				PathMatchingResourcePatternResolver().getResources("classpath:/mappers/**/*.xml"));
            
            return sessionFactory.getObject();
    }


}
