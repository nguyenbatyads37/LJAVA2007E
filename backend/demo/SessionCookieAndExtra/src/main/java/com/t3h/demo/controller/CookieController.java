package com.t3h.demo.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class CookieController {

	@GetMapping("/addCookie/{cookieUser}")
	public String addCookie(
			@PathVariable String cookieUser,
			HttpServletResponse response
			) {
		
		Cookie cookie = new Cookie("chuchuchacha", "butchi");
		cookie.setMaxAge(3600);
		response.addCookie(cookie);
		
		return "index";
	}
	
	@GetMapping(value = "/readCookies")
	public String readCookies(HttpServletRequest request) {
		
		Cookie[] cookies = request.getCookies();
		
		for (Cookie cook : cookies) {
			System.out.println(cook.getName() + ": " + cook.getValue());
		}
		
		return "index";
	}
	
	
}
