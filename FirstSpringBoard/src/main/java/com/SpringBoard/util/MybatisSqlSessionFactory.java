// SqlSession을 얻어오는 클래스

package com.SpringBoard.util;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class MybatisSqlSessionFactory {
	
	private static SqlSessionFactory sqlSessionFactory;
	private static final Logger logger = (Logger)LoggerFactory.getLogger(MybatisSqlSessionFactory.class); //디버깅을 위해서 logger를 사용합니다. 본 프로젝트에서는 System.out.println을 사용하지 않아요.
	
	public static SqlSessionFactory getSqlSessionFactory() {
        if (sqlSessionFactory == null) {
            InputStream inputStream;
            try {	
            	System.out.println(Resources.getDefaultClassLoader());
            	inputStream = Resources.getResourceAsStream("mybatis-config.xml"); //스트림으로 설정파일을 받아옵니다.
                
                sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream); //SessionFactoryBuilder를 이용해서 SessionFactory를 가져옵니다.
                logger.debug("세션 팩토리 생성 완료");
            } catch (IOException e) {
                throw new RuntimeException(e.getMessage());
            }
        }
        return sqlSessionFactory;
    }
	
	public static SqlSession openSession() {
        return getSqlSessionFactory().openSession();  //Session을 얻어오는 부분
    }


 

}
