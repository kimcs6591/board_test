package com.SpringBoard.model;

import java.util.List;

import com.SpringBoard.domain.BoardVO;

public interface BoardService {

	// ALL SELECT
	List<BoardVO> getBoardList();

	// ºÎºÐ SELECT (KEY = NO_EMP)
	List<BoardVO> getBoarList(String CD_COMPANY, String NO_EMP);

	// INSERT
	void createBoard(BoardVO vo);

	// UPDATE
	void updateBoard(BoardVO vo);

	// DELETE
	void deleteBoard(String CD_COMPANY, String NO_EMP);

}