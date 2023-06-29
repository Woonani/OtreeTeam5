package com.otree.douzone.service;

import java.sql.SQLException;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.otree.douzone.dao.EmpDao;
import com.otree.douzone.dao.WorkspaceDao;
import com.otree.douzone.dto.Workspace;

@Service
public class WorkspaceService {
	private SqlSession sqlsession;
	@Autowired
	public void setSqlsession(SqlSession sqlsession) {
		this.sqlsession = sqlsession;
	}
	
	public void createWorkspace (Workspace workspace) {
		try {
			WorkspaceDao workspaceDao = sqlsession.getMapper(WorkspaceDao.class);
			workspaceDao.insertWorkspace(workspace);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
