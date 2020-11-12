package com.t3h.demo.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/admin")
public class AdminController {

	@GetMapping(value = "/get")
	public String getAdmin() {
		return "hello admin";
	}
}
