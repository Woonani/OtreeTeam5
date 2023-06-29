package com.otree.douzone.dao;

import java.sql.SQLException;
import java.util.List;

import com.otree.douzone.dto.BoardFile;

public interface BoardFileDao {

	List<BoardFile> getFile(int boardId) throws  ClassNotFoundException, SQLException; //파일 조회(글 상세보기)
	int insertFile(List<BoardFile> list) throws ClassNotFoundException, SQLException; //파일 삽입 ( 첨부 누를 경우)
	int updateFile(BoardFile boardfile) throws ClassNotFoundException, SQLException; //파일 수정 
	int deleteFile(int fileId) throws ClassNotFoundException, SQLException; //파일 삭제 (글삭제시)
}
