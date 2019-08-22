package com.SpringBoard.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import java.util.ArrayList;

import com.SpringBoard.domain.BoardVO;
import com.SpringBoard.model.*;


public interface BoardMapper {
	
	List<BoardVO> findAllBoard();
	//List<BoardVO> findBoardByEMP(String CD_COMPANY, String NO_EMP);
	List<BoardVO> findBoardByEMP(@Param("CD_COMPANY") String CD_COMPANY, @Param("NO_EMP") String NO_EMP);
	void insertBoard(BoardVO board);
	void updateBoard(BoardVO board);
	void deleteBoard(@Param("CD_COMPANY") String CD_COMPANY, @Param("NO_EMP") String NO_EMP);
	
	
}
