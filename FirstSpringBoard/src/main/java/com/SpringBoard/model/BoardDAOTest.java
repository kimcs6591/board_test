package com.SpringBoard.model;

import java.util.List;

import static org.junit.Assert.assertNull;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.SpringBoard.domain.BoardVO;
import com.SpringBoard.util.MybatisSqlSessionFactory;
import com.SpringBoard.util.MybatisSqlSessionFactoryTest;

public class BoardDAOTest {
	
	SqlSession session;
	private static final Logger logger = LoggerFactory.getLogger(BoardDAOTest.class);
	
	@Before //모든 테스트 코드가 실행되기 전에 작동하는 메소드입니다. @Before 애노테이션으로 설정해줄 수 있어요.
    public void tearDown() throws Exception {
        session = MybatisSqlSessionFactory.openSession();
        logger.info("세션을 성공적으로 불러왔습니다.");
    }
 
    @Test //테스트 코드를 등록해주는 애노테이션입니다.
    public void getBoardListTest() {
        BoardDAO boardDAO = new BoardDAO();
        List<BoardVO> list = boardDAO.getBoardList();
        // 출력
        for (BoardVO vo : list) {
            logger.info(vo.toString());
        }
    } 
    
    @Test
    public void insertBoardListTest() {
    	try {
    		BoardVO vo = new BoardVO();
        	BoardDAO boardDAO = new BoardDAO();
        	vo.setCD_COMPANY("0327");
        	vo.setNO_EMP("t1");
        	vo.setNM_KOR("테스트");
        	vo.setNM_ENG("test1");
        	boardDAO.createBoard(vo);
        	//assertNull(vo);		// 테스트수행결과판독
    	}catch (Exception e) {
			// TODO: handle exception
    		System.out.println(e.toString());
		}
    	
    
    }
    

}
