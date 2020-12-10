package com.t3h.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.t3h.demo.entities.User;
import com.t3h.demo.service.UserRegisterService;

@Controller
public class UserController {
	
	@Autowired
	private UserRegisterService userRegisterService;

	@PostMapping("dangky")
	public String dangky(@ModelAttribute User user, Model model) {
		userRegisterService.dangky(user);
		model.addAttribute("msg", "Dang ky thanh cong");
		return "home";
	}
}
