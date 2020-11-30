package com.t3h.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoLogController {

	private Logger log = LoggerFactory.getLogger(DemoLogController.class);
	
	@GetMapping("/getLog")
	public String getLog() {
		
		for (int i = 0; i == 0; ) {
			log.trace("Day la trace log");
			log.debug("Day la debug log");
			log.info("Day la info log");
			log.warn("Day la warning log");
			log.error("Day la error log");
		}
		
		return "Get log success";
	}
	
}
