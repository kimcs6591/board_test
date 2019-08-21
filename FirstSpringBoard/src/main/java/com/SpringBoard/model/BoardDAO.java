package com.SpringBoard.model;

import java.util.List;
import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;

import com.SpringBoard.mappers.BoardMapper;
import com.SpringBoard.util.MybatisSqlSessionFactory;
import com.SpringBoard.domain.*;

public class BoardDAO {
	
	// ALL SELECT
	public List<BoardVO> getBoardList(){
		SqlSession session = MybatisSqlSessionFactory.openSession(); // SqlSession�� ���ɴϴ�.
		try {
			BoardMapper boardMapper = session.getMapper(BoardMapper.class); // ������ ���ؼ� ���۸� ���ɴϴ�.
			return boardMapper.findAllBoard(); // ���ۿ��� �Ʊ� ������ �� �޼ҵ带 ȣ���մϴ�.
		} finally {
			session.close(); // session�� �޼ҵ� �������� �� �ݾ��־���մϴ�.
		}
	}
	
	// �κ� SELECT (KEY = NO_EMP)
	public List<BoardVO> getBoarList(String CD_COMPANY, String NO_EMP) {
		SqlSession session = MybatisSqlSessionFactory.openSession();
		try {
			BoardMapper boardMapper = session.getMapper(BoardMapper.class);
			return boardMapper.findBoardByEMP(CD_COMPANY, NO_EMP);			
		} finally {
			// TODO: handle finally clause
			session.close();
		}
	}
	
	// INSERT
	public void createBoard(BoardVO vo)
	{
		SqlSession session = MybatisSqlSessionFactory.openSession();
		try {
			BoardMapper boardMapper = session.getMapper(BoardMapper.class);
			boardMapper.insertBoard(vo);
			session.commit();
			
		} finally {
			session.close();
		}
	}
	
	// UPDATE
	public void updateBoard(BoardVO vo) {
		SqlSession session = MybatisSqlSessionFactory.openSession();
		try {
			BoardMapper boardMapper = session.getMapper(BoardMapper.class);
			boardMapper.updateBoard(vo);
			session.commit();
			
		} finally {
			// TODO: handle finally clause
			session.close();
		}
		
	}
	
	// DELETE
	public void deleteBoard(String CD_COMPANY, String NO_EMP) {
		SqlSession session = MybatisSqlSessionFactory.openSession();
		try {
			BoardMapper boardMapper = session.getMapper(BoardMapper.class);
			boardMapper.deleteBoard(CD_COMPANY, NO_EMP);
			session.close();
			
		} finally {
			// TODO: handle finally clause
			session.close();
		}
		
		
	}

}
