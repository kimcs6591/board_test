package com.SpringBoard.model;

import java.util.List;
import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;

import com.SpringBoard.mappers.BoardMapper;
import com.SpringBoard.util.MybatisSqlSessionFactory;
import com.SpringBoard.domain.*;

public class BoardDAO {
	
	public List<BoardVO> getBoardList(){
		SqlSession session = MybatisSqlSessionFactory.openSession(); // SqlSession�� ���ɴϴ�.
		try {
			BoardMapper boardMapper = session.getMapper(BoardMapper.class); // ������ ���ؼ� ���۸� ���ɴϴ�.
			return boardMapper.findAllBoard(); // ���ۿ��� �Ʊ� ������ �� �޼ҵ带 ȣ���մϴ�.
		} finally {
			session.close(); // session�� �޼ҵ� �������� �� �ݾ��־���մϴ�.
		}
	}
	
	public void createBoard(BoardVO vo)
	{
		SqlSession session = MybatisSqlSessionFactory.openSession();
		try {
			BoardMapper boardMapper = session.getMapper(BoardMapper.class);
			boardMapper.insertBoard(vo);
			
		} finally {
			session.close();
		}
	}

}
