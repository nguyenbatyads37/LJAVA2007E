package com.t3h.demo.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ConfigVariable {
	public static boolean isCsrfDisabled;

	@Value("${spring.security.csrf.isDisabled}")
	public void setIsCsrfDisabled(boolean isCsrfDisabled) {
		ConfigVariable.isCsrfDisabled = isCsrfDisabled;
	}
}
