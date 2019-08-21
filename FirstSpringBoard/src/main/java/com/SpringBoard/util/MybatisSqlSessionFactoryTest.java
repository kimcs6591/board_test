package com.SpringBoard.util;

import org.apache.ibatis.session.SqlSession;

import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class MybatisSqlSessionFactoryTest {
	SqlSession session;
    private static final Logger logger = LoggerFactory.getLogger(MybatisSqlSessionFactoryTest.class);
 
    @Before //모든 테스트 코드가 실행되기 전에 작동하는 메소드입니다. @Before 애노테이션으로 설정해줄 수 있어요.
    public void tearDown() throws Exception {
        session = MybatisSqlSessionFactory.openSession();
        logger.info("세션을 성공적으로 불러왔습니다.");
    }
 
    @Test //테스트 코드를 등록해주는 애노테이션입니다.
    public void test() {
    }


}
