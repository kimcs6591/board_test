package com.springboard.test;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.SpringBoard.domain.BoardVO;
import com.SpringBoard.model.BoardDAOTest;
import com.SpringBoard.model.BoardService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:/root-context.xml")
public class ContextTest {
	private static final Logger logger = LoggerFactory.getLogger(BoardDAOTest.class);
	@Autowired
	BoardService boardService;
	BoardVO boardVO;
	
	@Before
	public void testsetUp() {
		boardVO = new BoardVO();
		boardVO.setCD_COMPANY("0327");
		boardVO.setNO_EMP("test3");
		boardVO.setNM_KOR("테스트3_수정");
		boardVO.setNM_ENG("test3_수정");
	}
	
	@Test
	public void getBoardtest()
	{
		List<BoardVO> vo = boardService.getBoardList();
		logger.info(vo.toString());
	}
	
	@Test
	public void selectBoardtest()
	{
		List<BoardVO> vo = boardService.getBoarList("0327", "t2");
		logger.info(vo.toString());
	}
	
	@Test
	public void insertBoardtest()
	{
		boardService.createBoard(boardVO);
	}
	
	@Test
	public void modifyBoardtest()
	{
		boardService.updateBoard(boardVO);
	}
	
	@Test
	public void deleteBoardtest()
	{
		boardService.deleteBoard("0327", "t2");
	}
	

}
