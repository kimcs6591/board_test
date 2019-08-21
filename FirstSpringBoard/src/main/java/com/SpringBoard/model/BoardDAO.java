package com.SpringBoard.model;

import java.util.List;
import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;

import com.SpringBoard.mappers.BoardMapper;
import com.SpringBoard.util.MybatisSqlSessionFactory;
import com.SpringBoard.domain.*;

public class BoardDAO {
	
	public List<BoardVO> getBoardList(){
		SqlSession session = MybatisSqlSessionFactory.openSession(); // SqlSession을 얻어옵니다.
		try {
			BoardMapper boardMapper = session.getMapper(BoardMapper.class); // 세션을 통해서 메퍼를 얻어옵니다.
			return boardMapper.findAllBoard(); // 매퍼에서 아까 구현해 준 메소드를 호출합니다.
		} finally {
			session.close(); // session은 메소드 단위마다 꼭 닫아주어야합니다.
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
