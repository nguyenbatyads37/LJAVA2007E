package com.t3h.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.t3h.demo.*")
public class SessionCookieAndExtraApplication {

	public static void main(String[] args) {
		SpringApplication.run(SessionCookieAndExtraApplication.class, args);
	}

}
