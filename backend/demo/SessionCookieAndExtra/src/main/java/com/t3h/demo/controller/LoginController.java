package com.t3h.demo.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.t3h.demo.pojo.User;

@Controller
public class LoginController {
	
	private User validUser = new User("heonhodethuong", "123456");
	
	@Autowired
	private HttpSession session;
	
	@GetMapping("/getLogin")
	public String getLogin() {
		return "login";
	}
	
	@PostMapping("/postLogin")
	public String postLogin(
			@ModelAttribute(name = "user") User user, 
			Model model
			) {
		if (user.getUsername().equals(validUser.getUsername()) &&
				user.getPassword().equals(validUser.getPassword())) {
			
			session.setAttribute("username", user.getUsername());
			model.addAttribute("msg", "Dang nhap thanh cong!");
			
		} else {
			model.addAttribute("msg", "Dang nhap khong thanh cong!");
		}
		return "success";
	}
	
	@GetMapping(value = "/logout")
	public String logout(Model model) {
		session.invalidate();
		model.addAttribute("msg", "Logout thanh cong");
		return "success";
	}
}
