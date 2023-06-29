package com.otree.douzone.testcontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestControllerForView {
	//test
	@GetMapping("/login")
	public String getLogin() {
		return "temporaryviwes/login";
	}
}
