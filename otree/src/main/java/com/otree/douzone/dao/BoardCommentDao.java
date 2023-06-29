package com.otree.douzone.dao;

import java.sql.SQLException;
import java.util.List;

import com.otree.douzone.dto.BoardComment;

public interface BoardCommentDao {
	
	List<BoardComment> getComment(int boardId) throws ClassNotFoundException, SQLException;
	int insertComment(BoardComment boardcomment) throws ClassNotFoundException, SQLException;
	int updateComment(String boardComment, int commentId) throws ClassNotFoundException, SQLException;
	int deleteComment(int boardId) throws ClassNotFoundException, SQLException;
	
}
