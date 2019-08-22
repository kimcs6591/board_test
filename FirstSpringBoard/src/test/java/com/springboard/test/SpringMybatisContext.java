package com.springboard.test;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.SpringBoard.mappers.BoardMapper;

//@Runwith와 @ContextConfiguration은 spring-test를 활용하는 애노테이션이에요. 테스트 코드에서도 의존성 주입이 가능하도록 해줍니다.
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:/root-context.xml")

public class SpringMybatisContext {

	@Autowired	
	BoardMapper boardMapper;
	//SqlSessionTemplate sqpSession;
	

	@Test
	public void test() {
		assertNotNull(boardMapper);
	}

}
