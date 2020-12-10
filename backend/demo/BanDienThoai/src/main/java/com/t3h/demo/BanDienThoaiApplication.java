package com.t3h.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
@ComponentScan("com.t3h.demo.*")
public class BanDienThoaiApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(BanDienThoaiApplication.class, args);
		PasswordEncoder encoder = (PasswordEncoder) context.getBean("passwordEncoder");
		System.out.println("password: " + encoder.encode("123456"));
	}

}
