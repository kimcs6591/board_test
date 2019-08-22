package com.SpringBoard.model;

import java.util.List;
import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import com.SpringBoard.mappers.BoardMapper;
import com.SpringBoard.util.MybatisSqlSessionFactory;
import com.SpringBoard.domain.*;

public class BoardDAO  {
	
	@Autowired
	BoardMapper boardMapper;
	
	// ALL SELECT	
	public List<BoardVO> getBoardList(){
		/* 기존(Spring(x), mybatis)
		 * SqlSession session = MybatisSqlSessionFactory.openSession(); // SqlSession을
		 * 얻어옵니다. try { BoardMapper boardMapper = session.getMapper(BoardMapper.class);
		 * // 세션을 통해서 메퍼를 얻어옵니다. return boardMapper.findAllBoard(); // 매퍼에서 아까 구현해 준
		 * 메소드를 호출합니다. } finally { session.close(); // session은 메소드 단위마다 꼭 닫아주어야합니다. }
		 */
		return boardMapper.findAllBoard();
	}
	 
	// 부분 SELECT (KEY = NO_EMP)
	
	public List<BoardVO> getBoarList(String CD_COMPANY, String NO_EMP) {
		/*
		 * SqlSession session = MybatisSqlSessionFactory.openSession(); try {
		 * BoardMapper boardMapper = session.getMapper(BoardMapper.class); return
		 * boardMapper.findBoardByEMP(CD_COMPANY, NO_EMP); } finally { // TODO: handle
		 * finally clause session.close(); }
		 */
		
		return boardMapper.findBoardByEMP(CD_COMPANY, NO_EMP);
		
	}
	
	// INSERT
	
	public void createBoard(BoardVO vo)
	{
		/*
		 * SqlSession session = MybatisSqlSessionFactory.openSession(); try {
		 * BoardMapper boardMapper = session.getMapper(BoardMapper.class);
		 * boardMapper.insertBoard(vo); session.commit();
		 * 
		 * } finally { session.close(); }
		 */
		
		boardMapper.insertBoard(vo);
	}
	
	// UPDATE
	
	public void updateBoard(BoardVO vo) {
		/*
		 * SqlSession session = MybatisSqlSessionFactory.openSession(); try {
		 * BoardMapper boardMapper = session.getMapper(BoardMapper.class);
		 * boardMapper.updateBoard(vo); session.commit();
		 * 
		 * } finally { // TODO: handle finally clause session.close(); }
		 */
		
		boardMapper.updateBoard(vo);
		
	}
	
	// DELETE
	
	public void deleteBoard(String CD_COMPANY, String NO_EMP) {
		/*
		 * SqlSession session = MybatisSqlSessionFactory.openSession(); try {
		 * BoardMapper boardMapper = session.getMapper(BoardMapper.class);
		 * boardMapper.deleteBoard(CD_COMPANY, NO_EMP); session.commit();
		 * 
		 * } finally { // TODO: handle finally clause session.close(); }
		 */
		
		boardMapper.deleteBoard(CD_COMPANY, NO_EMP);
		
		
	}

}
