package com.t3h.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
@ComponentScan(basePackages = "com.t3h.demo.*")
public class DemoSpringSecurityApplication {
	
	private static PasswordEncoder passwordEncoder;
	
	@Autowired
	@Qualifier(value = "passwordEncoder")
	public void setPasswordEncoder(PasswordEncoder passwordEncoder) {
		DemoSpringSecurityApplication.passwordEncoder = passwordEncoder;
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoSpringSecurityApplication.class, args);
		System.out.println("Encoded: " + passwordEncoder.encode("123456"));
	}

}
