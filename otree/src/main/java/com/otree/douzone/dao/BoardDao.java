package com.otree.douzone.dao;

import java.sql.SQLException;
import java.util.List;

import com.otree.douzone.dto.Board;


public interface BoardDao {
	
		int getBoardCount(String field, String query) throws ClassNotFoundException, SQLException; // 게시물 개수 가져오기, 페이징 처리에 필요한듯
		List<Board> getBoardListForPaging(int page, String field, String query) throws ClassNotFoundException, SQLException; // 페이징한 전체 게시물 가져오기
		
		List<Board> getBoardList() throws ClassNotFoundException, SQLException; //전체 게시물 가져오기
		List<Board> searchBoardByBoardTitle(String boardTitle) throws ClassNotFoundException, SQLException; // boardTitle로 게시물 검색
		List<Board> getBoardByBoardId(int boardId) throws ClassNotFoundException, SQLException; // boardId로 게시물 상세보기
	    void insertBoard(Board board) throws ClassNotFoundException, SQLException; // 게시물 생성
	    void updateEmp(Board board ) throws ClassNotFoundException, SQLException; // 게시물 업데이트
	    void deleteBoard(int boardId) throws ClassNotFoundException, SQLException; // 게시물 삭제
	    
	    
}
