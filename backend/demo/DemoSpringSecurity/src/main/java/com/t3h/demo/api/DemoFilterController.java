package com.t3h.demo.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoFilterController {

	@GetMapping(value = "/demoFilter")
	public String getDemo() {
		System.out.println("This is demo filter");
		return "demo success";
	}
}
