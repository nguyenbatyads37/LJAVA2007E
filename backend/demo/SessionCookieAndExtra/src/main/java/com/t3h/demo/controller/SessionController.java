package com.t3h.demo.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SessionController {

	@GetMapping(value = "/addSession")
	public String addSession(@RequestParam String username, 
			HttpServletRequest request) {
		
		HttpSession session = request.getSession();
		
		// Them gia tri vao session
		session.setAttribute("username", username);
		session.setAttribute("productId", "123");
		
		return "index";
	}
	
	@Autowired
	private HttpSession httpSession;
	
	@GetMapping(value = "/getAndRemoveSession")
	public String getAndRemoveSession(HttpServletRequest request) {
		
		// Lay attribute tu session
		String username = (String) httpSession.getAttribute("username");
		System.out.println("Session username: " + username);
		
		// Xoa attribute trong session
		request.getSession().removeAttribute("username"); // cach 1 - xoa username
		
		request.getSession().invalidate(); // cach 2 - xoa toan bo attribute
		
		return "index";
	}
	
	@GetMapping(value = "/home")
	public String getIndex() {
		return "index";
	}
}
