package com.SpringBoard.model;

import java.lang.System.Logger;
import java.util.List;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.FirstBoard.anomi.HomeController;
import com.SpringBoard.domain.BoardVO;

public class BoardServiceImpl implements BoardService {
	
	@Autowired
	BoardDAO boardDAO;
	
	//private static final Logger logger = (Logger) LoggerFactory.getLogger(BoardServiceImpl.class);


	@Override
	public List<BoardVO> getBoardList() {
		// TODO Auto-generated method stub
		return boardDAO.getBoardList();
	}

	@Override
	public List<BoardVO> getBoarList(String CD_COMPANY, String NO_EMP) {
		// TODO Auto-generated method stub
		return boardDAO.getBoarList(CD_COMPANY, NO_EMP);
	}

	@Override
	public void createBoard(BoardVO vo) {
		// TODO Auto-generated method stub
		 boardDAO.createBoard(vo);
	}

	@Override
	public void updateBoard(BoardVO vo) {
		// TODO Auto-generated method stub
		boardDAO.updateBoard(vo);
	}

	@Override
	public void deleteBoard(String CD_COMPANY, String NO_EMP) {
		// TODO Auto-generated method stub
		boardDAO.deleteBoard(CD_COMPANY, NO_EMP);
	}

}
