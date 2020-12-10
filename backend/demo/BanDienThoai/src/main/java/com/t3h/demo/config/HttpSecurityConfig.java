package com.t3h.demo.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.stereotype.Component;

import com.t3h.demo.entities.Authorities;
import com.t3h.demo.entities.Role;
import com.t3h.demo.service.CacheService;
import com.t3h.demo.util.ConfigVariable;
import com.t3h.demo.util.HttpMethodConverter;

@Component
public class HttpSecurityConfig {
	
	@Autowired
	private CacheService<List<Role>> cache;
	
	@Autowired
	private HttpMethodConverter converter;

	public void config(HttpSecurity http) throws Exception {
		if (ConfigVariable.isCsrfDisabled) {
			http.csrf().disable();
		}
		
		http.authorizeRequests()
		.antMatchers("/", "/js/**", "/css/**", "/bootstrap", "/dangky").permitAll();
		
		List<Authorities> listAu = new ArrayList<Authorities>();
		List<Role> roles = cache.getCache();
		for (Role role : roles) {
			List<Authorities> authorities = role.getAuthorities();
			listAu.addAll(authorities);
		}
		
		for (Authorities au : listAu) {
			http.authorizeRequests()
			.antMatchers(converter.getHttpMethod(au.getMethod()), au.getUrl()).hasAuthority(au.getName());
		}
		
		http
		.authorizeRequests().anyRequest().authenticated()
		.and()
		.formLogin();
	}
}
