package com.otree.douzone.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.otree.douzone.dto.Workspace;
import com.otree.douzone.service.WorkspaceService;

@RestController
@RequestMapping("/workspace")
public class WorkspaceRestController {
	
	private WorkspaceService workspaceService;
	
	@Autowired
	public WorkspaceRestController(WorkspaceService workspaceService) {
		this.workspaceService = workspaceService;
	}
	
	@PostMapping
	public ResponseEntity<String> createWorkspace(@RequestBody Workspace workspace) {
		System.out.println("workspace : "+workspace);
		workspaceService.createWorkspace(workspace);
		System.out.println("insert성공");
		return ResponseEntity.status(HttpStatus.CREATED).body("insert success");
	}
	
}
