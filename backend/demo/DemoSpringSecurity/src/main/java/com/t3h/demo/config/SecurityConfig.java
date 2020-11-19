package com.t3h.demo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter{

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
			.csrf().disable()
			.authorizeRequests()
			.antMatchers("/", "/js/**", "/css/**").permitAll()
			.antMatchers("/api/student/**").hasAuthority("STUDENT")
			.antMatchers("/api/admin/**").hasAuthority("ADMIN")
				.anyRequest().authenticated()
				.and()
			.formLogin()
			.loginPage("/login")
			.permitAll()
			.defaultSuccessUrl("/", true)
			.and()
			.logout()
				.logoutUrl("/logout")
				.logoutSuccessUrl("/login")
				.clearAuthentication(true)
				.deleteCookies("SESSIONID", "remember-me")
			;
	}
	
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder(12);
	}
	
	@Autowired
	private UserDetailsService userService;
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.authenticationProvider(daoAuthenticationProvider());
	}

	@Bean
	public DaoAuthenticationProvider daoAuthenticationProvider() {
		DaoAuthenticationProvider provider = new DaoAuthenticationProvider();
		provider.setUserDetailsService(userService);
		provider.setPasswordEncoder(passwordEncoder());
		return provider;
	}
	
//	@Override
//	@Bean
//	protected UserDetailsService userDetailsService() {
//		UserDetails student = User.builder()
//				.username("dungnguyen")
//				.password(passwordEncoder().encode("123456"))
//				.roles("STUDENT")
//				.build();
//		
//		UserDetails admin = User.builder()
//				.username("admin")
//				.password(passwordEncoder().encode("123456"))
//				.roles("ADMIN")
//				.build();
//		
//		return new InMemoryUserDetailsManager(
//				student,
//				admin
//				);
//	}
}
