package com.SpringBoard.model;

import java.util.List;

import static org.junit.Assert.assertNull;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;
import org.junit.Before;
import org.junit.Test;
import org.omg.PortableInterceptor.LOCATION_FORWARD;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.SpringBoard.domain.BoardVO;
import com.SpringBoard.util.MybatisSqlSessionFactory;
import com.SpringBoard.util.MybatisSqlSessionFactoryTest;

public class BoardDAOTest {
	
	SqlSession session;
	private static final Logger logger = LoggerFactory.getLogger(BoardDAOTest.class);
	
	@Before //��� �׽�Ʈ �ڵ尡 ����Ǳ� ���� �۵��ϴ� �޼ҵ��Դϴ�. @Before �ֳ����̼����� �������� �� �־��.
    public void tearDown() throws Exception {
        session = MybatisSqlSessionFactory.openSession();
        logger.info("������ ���������� �ҷ��Խ��ϴ�.");
    }
 
    @Test //�׽�Ʈ �ڵ带 ������ִ� �ֳ����̼��Դϴ�.
    // ��üselect
    public void getBoardListTest() {
        BoardDAO boardDAO = new BoardDAO();
        List<BoardVO> list = boardDAO.getBoardList();
        // ���
        for (BoardVO vo : list) {
            logger.info(vo.toString());            
        }
        logger.info("ȣ�⼺��");
    } 
    
    @Test
    // �κ� SELECT (CD_COMPANY, NO_EMP ����)
    public void getBoardListByConditionTest() {
    	// ���� : �ӽ�
    	String CD_COMPANY = "0327";
    	String NO_EMP = "t1";
    	
    	BoardDAO boardDAO = new BoardDAO();
    	List<BoardVO> list = boardDAO.getBoarList(CD_COMPANY, NO_EMP);
    	
    	for(BoardVO vo : list) {
    		logger.info(vo.toString());
    	}
    }
    
    @Test
    // insert
    public void insertBoardListTest() {
    	try {
    		BoardVO vo = new BoardVO();
        	BoardDAO boardDAO = new BoardDAO();
        	vo.setCD_COMPANY("0327");
        	vo.setNO_EMP("t2");
        	vo.setNM_KOR("�׽�Ʈ");
        	vo.setNM_ENG("test1");
        	boardDAO.createBoard(vo);
        	//assertNull(vo);		// �׽�Ʈ�������ǵ�
        	logger.info("ȣ�⼺��");
    	}catch (Exception e) {
			// TODO: handle exception
    		System.out.println(e.toString());
		}
    }
    
    @Test
    // UPDATE
    public void updateBoardListTest() {
    	
    	BoardVO vo = new BoardVO();
    	BoardDAO boardDAO = new BoardDAO();
    	vo.setCD_COMPANY("0327");
    	vo.setNO_EMP("t1");
    	vo.setNM_KOR("�׽�Ʈ_����");
    	vo.setNM_ENG("test1_modify");
    	boardDAO.updateBoard(vo);
    	
    }
    
    @Test
    // DELETE
    public void deleteBoardListTest() {
    	
    	String CD_COMPANY = "0327";
    	String NO_EMP = "t1";
    	BoardDAO boardDAO = new BoardDAO();
    	boardDAO.deleteBoard(CD_COMPANY, NO_EMP);
    }
    

}