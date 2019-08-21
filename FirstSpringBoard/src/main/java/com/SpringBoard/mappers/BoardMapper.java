package com.SpringBoard.mappers;

import java.util.List;
import java.util.ArrayList;

import com.SpringBoard.domain.BoardVO;
import com.SpringBoard.model.*;


public interface BoardMapper {
	
	List<BoardVO> findAllBoard();
	void insertBoard(BoardVO board);
	
}
